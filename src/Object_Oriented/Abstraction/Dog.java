package Object_Oriented.Abstraction;

public class Dog {
    // 属性
    public String brand;
    public String name;
    public int age;

    // 构造方法:无参构造
    // 我们自己定义了任何一款构造函数,那么系统都不再帮我们生成任何构造了
    public Dog(){

        System.out.println("看我执行了吗");
    }

    // 构造方法不能有任何返回类型,甚至连void都不能有
    public Dog(String brand, String name, int age){
        this.brand = brand;
        this.name = name;
        this.age = age;
    }

    public Dog(String brand, String name){
        this.brand = brand;
        this.name = name;
    }

    public Dog(String brand){
        this.brand = brand;
    }

    // 行为,方法
    public void run(){
        System.out.println("run");
    }

    public void bark(){
        System.out.println("bark");
    }

    public void show(){
        System.out.println("狗狗的品种是:" + brand + "  名字为:" + name + "  年龄为:" + age);
    }
}
