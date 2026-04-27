// BMI计算器
// BMI = 体重(公斤)/身高(m)的平方
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您的身高(cm):");
        double height = scanner.nextDouble();
        height = height / 100;
        //System.out.println(height);

        System.out.print("请输入您的体重(kg):");
        double weight = scanner.nextDouble();
        // '()'运算优先级更高
        double BMI = weight / (height * height);
        System.out.println(BMI);
    }
}
