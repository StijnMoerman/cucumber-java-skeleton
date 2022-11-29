package io.cucumber.skeleton;
public class Bowl {
    private int stones = 4;
    private final int sideOfPlayer;
    private final Bowl nextBowl;
    private final boolean isKalaha;

    public Bowl () {
        sideOfPlayer = 1;
        isKalaha = false;
        nextBowl = new Bowl(this, 2);
    }

    private Bowl (Bowl firstBowl, int numberOfBowl) {
        if (numberOfBowl % 7 == 0) {
            stones = 0;
            isKalaha = true;
        }
        else {
            isKalaha = false;
        }
        if (numberOfBowl < 8) {
            sideOfPlayer = 1;
        }
        else {
            sideOfPlayer = 2;
        }
        if (numberOfBowl == 14) {
            nextBowl = firstBowl;
        }
        else {
            nextBowl = new Bowl(firstBowl, numberOfBowl + 1);
        }
    }

    public int getSideOfPlayer() {
        return sideOfPlayer;
    }

    public int getStones () {
        return stones;
    }

    public void setStones (int stones) { // only used for tests to create specific scenarios
        this.stones = stones;
    }

    public boolean getIsKalaha () {
        return isKalaha;
    }

    public Bowl getNextBowl () {
        return nextBowl;
    }

    public boolean executeTurn () {
        int stonesToSpread = getStonesAndEmptyBowl();
        return nextBowl.takeStone(stonesToSpread,sideOfPlayer);
    }

    public boolean takeStone(int givenStones, int turnPlayer) {
        boolean isLastStoneInOwnKalaha = false;
        if (isKalaha && sideOfPlayer != turnPlayer) {
            isLastStoneInOwnKalaha = nextBowl.takeStone(givenStones,turnPlayer);
        }
        else {
            stones++;
            if (givenStones > 1) {
                isLastStoneInOwnKalaha = nextBowl.takeStone(givenStones - 1, turnPlayer);
            }
            else if (isKalaha) {
                isLastStoneInOwnKalaha = true;
            }
            else if (stones == 1 && sideOfPlayer == turnPlayer) {
                attackOppositeBowl();
            }
        }
        return isLastStoneInOwnKalaha;
    }

    public void attackOppositeBowl () {
        int stonesFromOppositeBowl = getOppositeBowl().getStonesAndEmptyBowl();
        int stonesFromOwnBowl = getStonesAndEmptyBowl();
        sendToKalaha(stonesFromOppositeBowl + stonesFromOwnBowl);
    }

    public Bowl getOppositeBowl() {
        int bowlsToKalaha = 0;
        Bowl nextKalaha = this;
        while (!nextKalaha.isKalaha) {
            nextKalaha = nextKalaha.nextBowl;
            bowlsToKalaha++;
        }
        Bowl oppositeBowl = nextKalaha;
        for (int i = 0; i < bowlsToKalaha; i++) {
            oppositeBowl = oppositeBowl.nextBowl;
        }
        return oppositeBowl;
    }

    public int getStonesAndEmptyBowl () {
        int stonesInThisBowl = stones;
        stones = 0;
        return stonesInThisBowl;
    }

    public void sendToKalaha (int stonesToKalaha) {
        if (isKalaha) {
            stones += stonesToKalaha;
        }
        else {
            nextBowl.sendToKalaha(stonesToKalaha);
        }
    }
}