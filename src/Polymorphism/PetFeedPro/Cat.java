package Polymorphism.PetFeedPro;

import Polymorphism.PetFeedPro.Pet;

public class Cat extends Pet {
    public Cat() {

    }

    public Cat(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void eat(int num) {
        this.power += num;
        System.out.println("猫猫"+this.name+"能量值增加了"+num+"当前能量值为:"+this.power);
    }
}
