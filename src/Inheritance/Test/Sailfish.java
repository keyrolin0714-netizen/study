package Inheritance.Test;

public class Sailfish extends Fish {
    public Sailfish() {

    }
    public Sailfish(int speed) {
        this.speed = speed;
    }
    @Override
    public int calc(int hours) {
        return speed * hours;
    }
}
