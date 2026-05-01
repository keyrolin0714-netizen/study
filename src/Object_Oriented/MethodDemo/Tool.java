package Object_Oriented.MethodDemo;

public class Tool {
    // 全局变量:类中定义的变量称为全局变量,它不被任何一个方法包含
    int num;// 系统会给默认值,如果是整型,默认值为0

    public void f1(){
        int a = 100; // 局部变量
        num = 3;
    }

    public void f2(){
        // System.out.println(a);
        num = 5;
    }

    // 局部变量

}
