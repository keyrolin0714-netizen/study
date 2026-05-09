package Object_Oriented.Polymorphism;

public class PetMain {
    public static void main(String[] args) {
        // 综合调度其他类
        Dog dog = new Dog("小黑",100);
        Cat cat = new Cat("可乐",100);
        Master master = new Master();
        master.feed(dog, 30);
        master.feed(cat, 50);
    }
}
