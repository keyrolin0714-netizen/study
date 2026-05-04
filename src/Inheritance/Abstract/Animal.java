package Inheritance.Abstract;
// 被Abstract修饰的类我们就称为抽象类
// 抽象类中可以出现抽象方法
public abstract class Animal {
    public void run(){

    }
    // 抽象方法必须没有实现,没有"{}"
    public abstract void show();
}
