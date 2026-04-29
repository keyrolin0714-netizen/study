package JavaBasic;// BMI计算器
// BMI = 体重(公斤)/身高(m)的平方
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的身高(cm):");
        double height = scanner.nextDouble();
        //height = height / 100;
        height /= 100;
        //System.out.println(height);

        System.out.print("请输入您的体重(kg):");
        double weight = scanner.nextDouble();
        // '()'运算优先级更高
        //double BMI = weight / (height * height);
        double BMI = weight / Math.pow(height, 2);
        BMI = Math.round(BMI * 100) / 100.0;// 保留小数点后两位
        System.out.println("您的BMI为:" + BMI);
        /*
            BMI计算器 + 判断机制
            体重过轻 BMI < 18.5
            体重正常 18.5 <=BMI < 24
            体重过重 24 <=BMI < 27
            轻度肥胖 27 <=BMI < 30
            中度肥胖 30 <=BMI < 35
            重度肥胖 BMI >= 35
         */

//        if(BMI < 18.5){
//            System.out.println("体重过轻");
//        } else if (BMI >= 18.5 && BMI < 24) {
//            System.out.println("体重正常");
//        } else if (BMI >= 24 && BMI < 27) {
//            System.out.println("体重过重");
//        } else if (BMI >= 27 && BMI < 30) {
//            System.out.println("轻度肥胖");
//        } else if (BMI >= 30 && BMI < 35) {
//            System.out.println("中度肥胖");
//        }else{
//            System.out.println("重度肥胖");
//        }
//        上述代码仍可以进行精简,结果如下
        if(BMI < 18.5){
            System.out.println("体重过轻");
        } else if (BMI < 24) {
            System.out.println("体重正常");
        } else if (BMI < 27) {
            System.out.println("体重过重");
        } else if (BMI < 30) {
            System.out.println("轻度肥胖");
        } else if (BMI < 35) {
            System.out.println("中度肥胖");
        }else{
            System.out.println("重度肥胖");
        }
    }
}
