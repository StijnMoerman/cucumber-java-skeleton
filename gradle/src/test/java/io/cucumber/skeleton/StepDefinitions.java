package io.cucumber.skeleton;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    private Bowl oneBowl;
    private Bowl anotherBowl;
    private Bowl firstBowl;
    private List<Integer> stoneDistributionList = new ArrayList<>();
    private Game game;
    private List<Integer> currentGameScenario = new ArrayList<>();

    @Given("I have a bowl")
    public void I_have_a_bowl() {
        firstBowl = new Bowl();
    }

    @Given("I have a game")
    public void I_have_a_game() {
        game = new Game();
    }

    @When("I consider bowl {int}")
    public void I_consider_bowl(int bowlNumber) {
        oneBowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            oneBowl = oneBowl.getNextBowl();
        }
    }

    @When("I consider another bowl {int}")
    public void I_consider_another_bowl(int bowlNumber) {
        anotherBowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            anotherBowl = anotherBowl.getNextBowl();
        }
    }

    @When("I consider how the stones are distributed") 
    public void I_consider_how_the_stones_are_distributed () {
        stoneDistributionList.add(987463521);
        stoneDistributionList.clear();
        Bowl bowl = firstBowl;
        for (int i = 0; i < 14; i++) {
            stoneDistributionList.add(bowl.getStones());
            bowl = bowl.getNextBowl();
        }
    }

    @When("I consider the current game scenario") 
    public void I_consider_the_current_game_scenario () {
        currentGameScenario.clear();
        for (int i = 1; i <= 14; i++) {
            currentGameScenario.add(game.getBowl(i).getStones());
        }
    }

    @When("this bowl sends {int} stones to Kalaha")
    public void this_bowl_sends_stones_to_Kalaha(int stones) {
        oneBowl.sendToKalaha(stones);
    }

    @When("this bowl attacks its opposite bowl")
    public void this_bowl_attacks_its_opposite_bowl() {
        oneBowl.attackOppositeBowl();
    }

    @When("this bowl takes {int} stones in turn of player {int}")
    public void this_bowl_takes_stones_in_turn_of_player(int stones, int turnPlayer) {
        oneBowl.takeStone(stones, turnPlayer);
    }

    @When("this bowl executes a turn")
    public void this_bowl_executes_a_turn() {
        oneBowl.executeTurn();
    }

    @When("a turn is executed with bowl {int}")
    public void a_turn_is_executed_with_bowl(int bowlNumber) {
        try {
            game.turnOfPlayer(bowlNumber);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        } 
    }

    @Then("this bowl has {int} stone(s)")
    public void this_bowl_has_stones(int stones) {
        assertEquals(stones, oneBowl.getStones());
    }

    @Then("the stones should be distributed like")
    public void the_stones_should_be_distributed_like (@Transpose List<Integer> list) {
        assertEquals(list, stoneDistributionList);
    }

    @Then("this bowl {string} a Kalaha")
    public void this_bowl_a_Kalaha(String isKalaha) {
        if (isKalaha.equals("is not")) {
            assertFalse(oneBowl.getIsKalaha());
        }
        else {
            assertTrue(oneBowl.getIsKalaha());
        }
    }

    @Then("this bowl is on side of player {int}")
    public void this_bowl_is_on_side_of_player(int player) {
        assertEquals(player, oneBowl.getSideOfPlayer());
    }

    @Then("these bowls are opposite bowls")
    public void these_bowls_are_opposite_bowls() {
        assertEquals(anotherBowl,oneBowl.getOppositeBowl());
    }

    @Then("the game is not finished yet")
    public void the_game_is_not_finished_yet() {
        assertFalse(game.endOfGame());
    }

    @Then("it is the turn of player {int}")
    public void it_is_the_turn_of_player(int player) {
        assertEquals(player,game.getTurnPlayer());
    }

    @Then("player {int} has {int} point(s)")
    public void player_has_points (int player, int points) {
        assertEquals(points, game.getPoints()[player-1]);
    }

    @Then("the current game scenario is like")
    public void the_current_game_scenario_is_like (@Transpose List<Integer> list) {
        assertEquals(list, currentGameScenario);
    }
}
