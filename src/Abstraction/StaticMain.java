package Abstraction;

public class StaticMain {
    public static void main(String[] args) {
        StaticTest num1 = new StaticTest();
        // 由于类只会被加载一次,所有静态成员也只被加载一次
        StaticTest num2 = new StaticTest();
        System.out.println(StaticTest.num);
    }
}
