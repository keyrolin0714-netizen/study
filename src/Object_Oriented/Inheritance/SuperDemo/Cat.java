package Object_Oriented.Inheritance.SuperDemo;

public class Cat extends Animal {
    public void show(){
        super.age = 20;
    }

    public Cat(){
        super(2);
        System.out.println("cat构造");
    }
}
