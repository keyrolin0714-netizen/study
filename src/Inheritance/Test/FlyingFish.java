package Inheritance.Test;

public class FlyingFish extends Fish {
    public FlyingFish() {

    }

    public FlyingFish(int speed) {
        this.speed = speed;
    }

    @Override
    public int calc(int hours) {
        return speed * hours;
    }
}
