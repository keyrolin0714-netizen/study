package Object_Oriented.MethodDemo.Bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        // 存取款功能
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.存款  2.取款  0.退出  请选择您要办理的业务");
            int num1 = sc.nextInt();
            if (num1 == 1) {
                //存款
                System.out.println("这里是存储功能,请输入存款金额");
                double money = sc.nextDouble();
                account.saveMoney(money);
            }else if (num1 == 2) {
                System.out.println("这里是取款功能");
                System.out.println("请输入取款金额");
                double money = sc.nextDouble();
                account.takeOutMoney(money);
            }else if (num1 == 0) {
                System.out.println("感谢使用");
                break;
            }else {
                System.out.println("选择有误,请重新选择");
            }
        }
    }
}
