package io.cucumber.skeleton;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

class Cukes {
    static String bellyIsDoing () {
        return "growl";
    }
}

public class StepDefinitions {
    private Belly belly;
    private Bowl consideredBowl;
    private Bowl firstBowl;

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly = new Belly();
        belly.eat(cukes);
    }

    @Given("I have a bowl")
    public void I_have_a_bowl() {
        firstBowl = new Bowl();
    }

    @When("I wait {int} hour(s)")
    public void I_wait_hours(int hours) {
        belly.wait(hours);
    }

    @When("I consider bowl number {int}")
    public void I_consider_bowl_number(int bowlNumber) {
        consideredBowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            consideredBowl = consideredBowl.getNextBowl();
        }
    }

    @Then("my belly should {string}")
    public void My_belly_should_growl(String expected) {
        if (expected.equals("growl")) {
            assertTrue(belly.getIsGrowling());
        }
        else if (expected.equals("hurt")) {
            assertTrue(belly.getIsHurting());
        }
        else if (expected.equals("feel fine")) {
            assertFalse(belly.getIsGrowling());
            assertFalse(belly.getIsHurting());
        }
        else {
            assertFalse(belly.getIsGrowling());
            assertFalse(belly.getIsHurting());
        }
    }

    @Then("this bowl has {int} stone(s)")
    public void this_bowl_has_stones(int stones) {
        assertEquals(stones, consideredBowl.getStones());
    }

    @Then("this bowl {string} a Kalaha")
    public void this_bowl_a_Kalaha(String isKalaha) {
        if (isKalaha.equals("is not")) {
            assertFalse(consideredBowl.getIsKalaha());
        }
        else {
            assertTrue(consideredBowl.getIsKalaha());
        }
    }

    @Then("this bowl is on side of player {int}")
    public void this_bowl_is_on_side_of_player(int player) {
        assertEquals(player, consideredBowl.getSideOfPlayer());
    }

    @Then("this bowl has opposite bowl {int}")
    public void bowl_has_opposite_bowl(int oppositeBowlNumber) {
        Bowl oppositeBowl = firstBowl;
        for (int i = 1; i < oppositeBowlNumber; i++) {
            oppositeBowl = oppositeBowl.getNextBowl();
        }
        assertEquals(oppositeBowl,consideredBowl.getOppositeBowl());
    }

    // some feature with asserting if the game is ended yet

}
