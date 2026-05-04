package Polymorphism.Void_FatherClass;

public class AnimalMain {
    public static void main(String[] args) {
        GrandPa grandPa = new GrandPa();
        String[] types = {"dog", "cat", "pig"};
        // for增强
        for (String type : types) {
            Animal animal = grandPa.getAnimal(type);
            // 调度到的是对应子类的getShape()
            animal.getShape();
        }
    }
}
