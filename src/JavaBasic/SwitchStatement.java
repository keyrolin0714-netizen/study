package JavaBasic;// switch语句
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        String key = sc.nextLine();

        switch (key) {
            case "a":
                System.out.println("星期日");
                break;
            case "b":
                System.out.println("星期一");
                break;
            case "c":
                System.out.println("星期二");
                break;
            case "d":
                System.out.println("星期三");
                break;
            case "e":
                System.out.println("星期四");
                break;
            case "f":
                System.out.println("星期五");
                break;
            case "g":
                System.out.println("星期六");
                break;
                // 注意!!!switch语句无法判断浮点数
                // 每条switch语句结束后使用break结束

            default:
                System.out.println("请输入数字a~g");
        }

//        if (num == 0) {
//            System.out.println("星期日");
//        }else if (num == 1) {
//            System.out.println("星期一");
//        }else if (num == 2) {
//            System.out.println("星期二");
//        }else if (num == 3) {
//            System.out.println("星期三");
//        }else if (num == 4) {
//            System.out.println("星期四");
//        }else if (num == 5) {
//            System.out.println("星期五");
//        }else if (num == 6) {
//            System.out.println("星期六");
//        }else {
//            System.out.println("请输入数字0~6");
//        }
    }
}
