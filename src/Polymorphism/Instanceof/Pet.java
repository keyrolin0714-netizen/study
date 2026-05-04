package Polymorphism.Instanceof;
// 动物父类(抽象类)
public abstract class Pet {
    String name;// 名字
    int power;// 能量值
    // 吃东西,进而补充能量值
    public abstract void eat(int num);
}
