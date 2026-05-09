package Object_Oriented.Polymorphism.Void_FatherClass;
// 吹糖人的老爷爷
public class GrandPa {
    // 根据客户的要求吹
    public Animal getAnimal(String type) {
        Animal animal = null;
        if (type.equals("dog")) {
            animal = new Dog();
        }else if (type.equals("cat")) {
            animal = new Cat();
        }else if (type.equals("pig")) {
            animal = new Pig();
        }
        return animal;
    }
}
