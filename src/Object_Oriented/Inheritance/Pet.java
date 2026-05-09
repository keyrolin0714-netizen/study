package Object_Oriented.Inheritance;

// 定义一个父类 Pet
public class Pet {
    // 属性
    public String name;
    // 私有成员的属性无法继承
    // private int age;
    // 方法

    public void run(String name){
        System.out.println(name + "正在跑");
    }
}
