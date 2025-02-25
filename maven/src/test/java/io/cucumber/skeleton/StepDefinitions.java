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
}
