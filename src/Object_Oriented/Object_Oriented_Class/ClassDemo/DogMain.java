package Object_Oriented.Object_Oriented_Class.ClassDemo;

public class DogMain {
    // main函数是程序的入口函数
    public static void main(String[] args) {
        // 在Java中创建一个狗狗对象
        Dog dog = new Dog();//new相当于向内存申请一块空间
        dog.name = "小黄";
        dog.age = 5;

        Dog dog2 = new Dog();
        dog2.name = "小黑";
        dog2.age = 3;
        // 自我介绍的方法
        dog.sayHello();
        dog2.sayHello();
    }
}
