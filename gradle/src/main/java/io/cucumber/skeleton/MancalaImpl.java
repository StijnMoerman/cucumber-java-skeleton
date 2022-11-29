package io.cucumber.skeleton;

public class MancalaImpl implements Mancala {
    final Game game;

    public MancalaImpl() {
        this.game = new Game();
    }

    @Override
    public boolean isPlayersTurn(int player) {
        return player == this.game.getTurnPlayer();
    }

    @Override
	public void playPit(int index) /*throws MancalaException*/ {
        this.game.turnOfPlayer(index);
        if (this.isEndOfGame()) {
            this.game.sendAllStonesToNextKalaha();
        }
    }
	
	@Override
	public int getStonesForPit(int index) {
        return this.game.getBowl(index).getStones();
    }

	@Override
	public boolean isEndOfGame() {
        return this.game.endOfGame();
    }

	@Override
	public int getWinner() {
        int[] points = this.game.getPoints();
        if (!isEndOfGame()) {
            return Mancala.NO_PLAYERS;
        }
        else if (points[0] > points[1]) {
            return Mancala.PLAYER_ONE;
        }
        else if (points[1] > points[0]) {
            return Mancala.PLAYER_TWO;
        }
        else {
            return Mancala.BOTH_PLAYERS;
        }
    }
}