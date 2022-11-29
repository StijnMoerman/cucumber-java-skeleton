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

    @Then("bowl {int} has {int} stone(s)")
    public void bowl_has_stones(int bowlNumber, int stones) {
        Bowl bowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            bowl = bowl.getNextBowl();
        }
        assertEquals(stones, bowl.getStones());
    }

    @Then("bowl number {int} {string} a Kalaha")
    public void bowl_is_a_Kalaha(int bowlNumber, String isKalaha) {
        Bowl bowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            bowl = bowl.getNextBowl();
        }
        if (isKalaha.equals("is not")) {
            assertFalse(bowl.getIsKalaha());
        }
        else {
            assertTrue(bowl.getIsKalaha());
        }
    }

    @Then("bowl number {int} is on side of player {int}")
    public void bowl_is_on_side_of_player(int bowlNumber, int player) {
        Bowl bowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            bowl = bowl.getNextBowl();
        }
        assertEquals(player, bowl.getSideOfPlayer());
    }

    @Then("bowl {int} has opposite bowl {int}")
    public void bowl_has_opposite_bowl(int bowlNumber, int oppositeBowlNumber) {
        Bowl bowl = firstBowl;
        Bowl oppositeBowl = firstBowl;
        for (int i = 1; i < bowlNumber; i++) {
            bowl = bowl.getNextBowl();
        }
        for (int i = 1; i < oppositeBowlNumber; i++) {
            oppositeBowl = oppositeBowl.getNextBowl();
        }
        assertEquals(oppositeBowl,bowl.getOppositeBowl());
    }

    // some feature with asserting if the game is ended yet

}
