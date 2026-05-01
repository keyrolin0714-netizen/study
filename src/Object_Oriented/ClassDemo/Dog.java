package Object_Oriented.ClassDemo;

// 创建一个Dog类,类名首字母要大写
public class Dog{ //类名
    // 静态属性
    String name;
    int age;
    // 动态属性 --> 行为 --> 方法
    public void sayHello(){ //方法名
        System.out.println("我的名字是" + name + ",我今年" + age + "岁了");
    }
}
