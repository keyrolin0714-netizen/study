package Object_Oriented.Interface.Calc;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        System.out.println("请输入第一个操作数:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("请输入第二个操作数:");
        int num2 = sc.nextInt();
        // 加减乘除
        // 接口数组
        Calc[] calcs = {new Add(),new Sub(),new Mul(),new Div()};
        for(Calc calc : calcs){
            double result = calc.calc(num1,num2);
            System.out.println(result);
        }
    }
}
