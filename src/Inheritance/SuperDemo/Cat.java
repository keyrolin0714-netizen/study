package Inheritance.SuperDemo;

import java.awt.print.Pageable;

public class Cat extends Animal {
    public void show(){
        super.age = 20;
    }

    public Cat(){
        super(2);
        System.out.println("cat构造");
    }
}
