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

    @Given("I have a bowl")
    public void I_have_a_bowl() {
        firstBowl = new Bowl();
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

}
