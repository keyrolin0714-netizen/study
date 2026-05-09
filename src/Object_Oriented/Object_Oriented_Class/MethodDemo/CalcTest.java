package Object_Oriented.Object_Oriented_Class.MethodDemo;

public class CalcTest {
    // 语文
    int chinese;

    // 数学
    int math;

    // 英语
    int english;

    //定义一个求总成绩的方法,返回值就是总成绩
    public int getTotal(){
        int totalScore = chinese + math + english;
        return totalScore;
    }

    // 写一个求平均值的方法
    // 同一个类当中,方法可以直接通过方法名调用
    public double getAvgScore(){
        return getTotal()/3.0;
    }

//    // 定义一个求平均分的方法
//    public double getAvgScore(){
//        double result = (chinese + math + english) / 3.0;
//        return result;
//    }
}
