package Encapsulation;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("小黄");
        String name = dog.getName();
        System.out.println(name);
        dog.setAge(-100);
        System.out.println(dog.getAge());
    }
}
