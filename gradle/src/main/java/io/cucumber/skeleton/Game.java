package io.cucumber.skeleton;
public class Game {
    private final Bowl firstBowl = new Bowl();
    private int turnPlayer = 1;

    public Bowl getFirstBowl () { // only used in test to create a specific scenario
        return firstBowl;
    }

    public int getTurnPlayer () {
        return turnPlayer;
    }

    public Bowl getBowl(int bowlNumber) {
        Bowl bowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            bowl = bowl.getNextBowl();
        }
        return bowl;
    }

    public int getBowlNumber (int inputInteger) {
        return inputInteger + 7 * (turnPlayer - 1);
    }

    public void turnOfPlayer (int inputInteger) {
        if (inputInteger > 6 || inputInteger < 1) {
            throw new ArithmeticException("Invalid input - Only integers from 1 til 6 are allowed");
        }
        int bowlNumber = getBowlNumber(inputInteger);
        Bowl bowlToExecute = getBowl(bowlNumber);
        if (bowlToExecute.getStones() == 0) {
            throw new ArithmeticException("Invalid input - Empty bowl is chosen");
        }
        boolean isLastStoneInOwnKalaha = bowlToExecute.executeTurn();
        if (!isLastStoneInOwnKalaha) {
            turnPlayer = 3 - turnPlayer;
        }
    }

    public void sendAllStonesToNextKalaha () {
        Bowl bowl = firstBowl;
        for (int i = 0; i < 14; i++) {
            bowl.sendToKalaha(bowl.getStonesAndEmptyBowl());
            bowl = bowl.getNextBowl();
        }
    }

    public boolean endOfGame () {
        return !playerCanDoTurn();
    }

    public boolean playerCanDoTurn () {
        for (int i = 1; i < 7; i++) {
            if (getBowl(getBowlNumber(i)).getStones() > 0) {
                return true;
            }
        }
        return false;
    }

    public int[] getPoints() {
        Bowl bowl = firstBowl;
        int[] points = {0,0};
        for (int i = 0; i < 14; i++) {
            if (bowl.getIsKalaha()) {
                points[bowl.getSideOfPlayer()-1] = bowl.getStones();
            }
            bowl = bowl.getNextBowl();
        }
        return points;
    }
}