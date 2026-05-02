package Object_Oriented.MethodDemo;

import java.util.Scanner;

public class Recursion_Factorial {

    public static int func(int n) {
        if (n == 1){
            return 1;
        }else {
            return n * func(n-1);
        }
    }
    public static void main(String[] args) {
        // 求n的阶乘
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(func(num));
    }
}
