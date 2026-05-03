package Abstraction;

public class Cat {
    static String name;
    static int num;
    static {
        num++;
        System.out.println(num);
    }
    // 只关注方法
    public int test(String name,int age){
        return 1;
    }

    public void test(int age,String name){

    }
    public static void show() {
        System.out.println("我是static的show方法");
    }
}
