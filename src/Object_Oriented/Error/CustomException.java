package Object_Oriented.Error;

import java.util.Scanner;

//Exception所属的是检查异常
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
// 一个类文件中只能有一个public修饰的类
public class CustomException {
    public static void main(String[] args) {
        // 自定义异常
        // 登记用户的姓名和年龄
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.nextLine();
        System.out.println("请输入年龄:");
        int age = sc.nextInt();
        try {
            if (age < 0) {
                // 年龄非法
                throw new AgeException("年龄不能为负数");
            }
            System.out.println("姓名:" + name);
            System.out.println("年龄:" + age);
        } catch (AgeException e) {
                System.out.println(e.getMessage());
            }finally {
                System.out.println("程序结束");

            }

    }
}
