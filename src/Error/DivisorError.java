package Error;

import java.util.Scanner;

public class DivisorError {
    public static void main(String[] args) {
        // 异常处理
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个操作数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个操作数:");
        int num2 = sc.nextInt();
        // 当异常发生的时候,后续代码无执行机会
        int result = 0;
        try{
            result = num1 / num2;
            System.out.println("结果为:" + result);
        } catch (Exception ex) {
            //ex就是异常对象
            System.err.println("除数不能为0");
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("程序结束");
        }
    }
}
