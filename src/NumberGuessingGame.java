import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100)+1;
        System.out.println("请输入一个1~100的整数:");
        for (;;) {
            int num1 = sc.nextInt();
            if (num1 > num) {
                System.out.println("太大了");
            }else if (num1 < num) {
                System.out.println("太小了");
            }else if(num1 == num) {
                System.out.println("恭喜你猜对了");
                break;
            }
        }




    }
}
