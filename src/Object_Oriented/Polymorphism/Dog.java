package Object_Oriented.Polymorphism;

public class Dog extends Pet{
    // 构造函数 默认的能量值
    public Dog() {

    }

    public Dog(String name, int power) {
        this.name = name;
        this.power = power;
    }
    // 注解
    @Override
    public void eat(int num) {
        this.power += num;
        System.out.println("狗狗"+this.name+"能量值增加了"+num+"当前能量值为:"+this.power);
    }
}
