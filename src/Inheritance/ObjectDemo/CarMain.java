package Inheritance.ObjectDemo;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("奥迪","黑色",200000);
        // 当我们打印一个对象名字的时候,自动默认调用toString方法
        System.out.println(car.toString());

        Car car1 = new Car("奥迪","黑色",200000);
        System.out.println(car == car1);
        System.out.println(car.equals(car1));
    }
}
