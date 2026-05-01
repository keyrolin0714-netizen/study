package Object_Oriented.MethodDemo;

import java.util.Scanner;

public class Clac_03Main {
    public static void main(String[] args) {
        Clac_03 calc = new Clac_03();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 = sc.nextInt();
        System.out.println("请输入运算符");
        char oper = sc.next().charAt(0);// 下标为0,第一个符号
        int result = calc.calc(num1, num2, oper);
        if (result == -1){
            System.out.println("除数不能为0");
        }else if (result == -2){
            System.out.println("操作符错误");
        }else {
            System.out.println(result);
        }

    }
}
