package io.cucumber.skeleton;

public class Belly {
    private boolean isGrowling = false;
    private boolean isHurting = false;
    private int cukesEaten = 0;
    private int hoursWaited = 0;

    private void goingToGrowl () {
        if (hoursWaited == 1 && cukesEaten >= 10) {
            isGrowling = true;
        }
    }
    private void goingToHurt () {
        if (hoursWaited == 2 && cukesEaten >= 20) {
            isHurting = true;
        }
    }

    public void eat(int cukes) {
        cukesEaten += cukes;
        goingToGrowl();
        goingToHurt();
    }
    public void wait(int hours) {
        hoursWaited += hours;
        goingToGrowl();
        goingToHurt();
    }
    public boolean getIsGrowling () {
        return isGrowling;
    }
    public boolean getIsHurting () {
        return isHurting;
    }
}
