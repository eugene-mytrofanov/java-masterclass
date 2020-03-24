package net.mytrofanov.inheritance.challenge;

public class SkodaOctavia extends Car {

    private int from0to100;
    private int roadServiceMonths;

    public SkodaOctavia(int yearOfIssue, int from0to100, int roadServiceMonths) {
        super("SkodaOctavia", "Medium", 4, 5, 4, false, yearOfIssue);
        this.from0to100 = from0to100;
        this.roadServiceMonths = roadServiceMonths;
    }

    public int getFrom0to100() {
        return from0to100;
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity < 30 && newVelocity <= 40) {
            changeGear(4);
        } else {
            changeGear(5);
        }
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
