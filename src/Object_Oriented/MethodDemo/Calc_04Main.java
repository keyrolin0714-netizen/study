package Object_Oriented.MethodDemo;

import java.util.Scanner;

public class Calc_04Main {
    public static void main(String[] args) {
        // 实例化
        int[] scores = new int[5];
        Calc_04 calc = new Calc_04();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入五位同学的成绩:");
        // 数组赋值的操作
        for (int i = 0;i < scores.length;i++) {
            scores[i] = sc.nextInt();
        }
        // alt+Enter按键
        double avgScores = calc.getAvgScore(scores);
        int maxScore = calc.getMaxScore(scores);
        System.out.println("平均分为:" + avgScores);
        System.out.println("最高分为:" + maxScore);
    }
}
