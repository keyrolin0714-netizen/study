package Object_Oriented.Abstraction;

public class DogMain {
    public static void main(String[] args) {
        // ctrl + 鼠标左键,可以在idea中转到定义
        // 1.本质上是调用了无参构造方法
        // 2.构造方法是可以创建对象的
        // 3.手动写了构造,系统不再提供构造
        Dog d = new Dog("哈士奇","二哈",3);
        d.show();
    }
}
