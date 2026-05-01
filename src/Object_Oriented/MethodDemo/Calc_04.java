package Object_Oriented.MethodDemo;

// 定义一个计算类
public class Calc_04 {
    // 01 定义一个求平均成绩的方法
    public double getAvgScore(int[] scores) {
        int sum = 0;
        for(int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        // 平均分 = 总分/总人数
        double avg = sum*1.0/scores.length;
        return avg;
    }
    // 02 定义一个求最高分的方法
    public int getMaxScore(int[] scores) {
        // 求最高分,核心思想,默认第一项是最高分
        int max = scores[0];
        for(int i=1;i<scores.length;i++){
            if(scores[i]>max){
                max = scores[i];
            }
        }
        return max;
    }
}
