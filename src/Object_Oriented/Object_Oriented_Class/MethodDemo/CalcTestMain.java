package Object_Oriented.Object_Oriented_Class.MethodDemo;

import java.util.Scanner;

public class CalcTestMain {
    public static void main(String[] args) {
        // 求总分和平局分
        Scanner sc = new Scanner(System.in);
        // 创建CalcTest的对象
        CalcTest ct = new CalcTest();
        // 提示输入语文成绩
        System.out.println("请输入语文成绩:");
        ct.chinese = sc.nextInt();
        // 数学成绩
        System.out.println("请输入数学成绩:");
        ct.math = sc.nextInt();
        // 英语成绩
        System.out.println("请输入英语成绩:");
        ct.english = sc.nextInt();

        // 调度求总分的方法,求出总成绩并打印
        int sum = ct.getTotal();
        System.out.println("总成绩为:" + sum);

        // 调度求平均分的方法,求出平均分并打印
        double avgScore = ct.getAvgScore();
        String result = String.format("%.2f", avgScore);
        System.out.println("平均分为:" + result);
    }
}
