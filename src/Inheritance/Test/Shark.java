package Inheritance.Test;

public class Shark extends Fish {
    public Shark() {

    }

    public Shark(int speed) {
        this.speed = speed;
    }

    @Override
    public int calc(int hours) {
        return speed * hours;
    }
}
