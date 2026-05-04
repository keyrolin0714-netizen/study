package Polymorphism.Instanceof;

public class Master {
    public void feed(Pet pet, int num) {
        pet.eat(num);
    }

    // 用Master类中的work方法驱动动物们工作
    public void work(Pet pet) {
        // 我们得区分动物的类型,对象instanceof 类型
        if(pet instanceof Dog){
            Dog dog = (Dog)pet;
            dog.seeDoor();
        }else if(pet instanceof Cat){
            Cat cat = (Cat)pet;
            cat.catchMouse();
        }
    }
}


