package Object_Oriented.Error;
// 输入1~7之间任意一个数字,程序将会输出相应的星期名称,
// 如果输入的不是数字,给出提示
// 如果输入1~7之外的数字,提示无对应数据
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorErrorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入1~7中任意一个数字:");
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.err.println("输入的不是整数数字");
        }catch (Exception ex) {
            System.out.println("未知错误");
        } finally {
            switch (num) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期七");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("无对应数据");
                    break;
            }
            System.out.println("程序结束");
        }

    }
}
