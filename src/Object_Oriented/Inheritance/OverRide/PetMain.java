package Object_Oriented.Inheritance.OverRide;

public class PetMain {
    public static void main(String[] args) {
        Pet cat = new Cat();
        // 调度的run是父类的run还是子类的run
        cat.run();// 方法的重写
    }
}
