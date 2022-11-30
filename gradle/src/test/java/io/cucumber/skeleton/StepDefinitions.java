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

    @When("I wait {int} hour(s)")
    public void I_wait_hours(int hours) {
        belly.wait(hours);
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

    @When("this bowl sends {int} stones to Kalaha")
    public void this_bowl_sends_stones_to_Kalaha(int stones) {
        oneBowl.sendToKalaha(stones);
    }

    @When("this bowl attacks its opposite bowl")
    public void this_bowl_attacks_its_opposite_bowl() {
        oneBowl.attackOppositeBowl();
    }

    @Then("I consider this bowls opposite bowl")
    public void I_consider_this_bowls_opposite_bowl () {
        oneBowl = oneBowl.getOppositeBowl();
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
