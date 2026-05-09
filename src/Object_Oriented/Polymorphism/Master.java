package Object_Oriented.Polymorphism;
// 主人类,投喂不同的动物
public class Master {
    public void feed(Dog dog, int num) {
        dog.eat(num);
    }
    public void feed(Cat cat, int num) {
        cat.eat(num);
    }

}
