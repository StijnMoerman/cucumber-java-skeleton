package io.cucumber.skeleton;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    private Belly belly;
    private Bowl oneBowl;
    private Bowl anotherBowl;
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
        assertEquals(stones, oneBowl.getStones());
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

    // some feature with asserting if the game is ended yet

}
