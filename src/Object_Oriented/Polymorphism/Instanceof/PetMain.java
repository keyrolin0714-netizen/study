package Object_Oriented.Polymorphism.Instanceof;


public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("小黄",100);
        Cat cat = new Cat("可乐",100);
        Master master = new Master();
        master.work(dog);
        master.work(cat);
    }
}
