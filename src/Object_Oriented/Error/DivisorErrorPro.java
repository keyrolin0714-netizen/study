package Object_Oriented.Error;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorErrorPro {
    public static void main(String[] args) {
        // 多路异常捕获
        Scanner sc = new Scanner(System.in);
        // try-catch-finally有简化写法...通过快捷键快速构建它的架构
        try {
            System.out.println("请输入被除数:");
            int num1 = sc.nextInt();
            System.out.println("请输入除数:");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch (InputMismatchException ex){
            System.err.println("被除数和除数必须是整数");
        }catch (ArithmeticException ex){
            System.err.println("除数不能为0");
        }catch (Exception ex){
            System.err.println("其他异常");
        }finally {
            System.out.println("程序结束");
        }
    }
}
