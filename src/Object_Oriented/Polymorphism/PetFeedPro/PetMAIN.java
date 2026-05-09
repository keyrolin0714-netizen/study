package Object_Oriented.Polymorphism.PetFeedPro;


public class PetMAIN {
    public static void main(String[] args) {
        Dog dog = new Dog("小黄",100);
        Cat cat = new Cat("可乐",100);
        Master master = new Master();
        master.feed(dog,30);
        master.feed(cat,50);
    }
}
