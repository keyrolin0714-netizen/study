// 产生随机数字
import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(9)+1;
        System.out.println(x);
    }
}
