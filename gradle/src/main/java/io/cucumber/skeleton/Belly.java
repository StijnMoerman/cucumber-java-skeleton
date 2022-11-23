package io.cucumber.skeleton;

public class Belly {
    private boolean isGrowling = false;
    private boolean hurts = false;
    public void eat(int cukes) {

    }
    public void wait(int hours) {
        if (hours == 1) {
            isGrowling = true;
        }
        if (hours == 2) {
            hurts = true;
        }
    }
    public boolean getIsGrowling () {
        return isGrowling;
    }
    public boolean getHurts () {
        return hurts;
    }
}
