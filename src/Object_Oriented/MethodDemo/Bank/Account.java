package Object_Oriented.MethodDemo.Bank;

public class Account {
    double money;// 定义账号余额
    // 01查询余额
    public double getMoney() {
        return money;
    }

    // 02存款
    public void saveMoney(double num) {
        money += num;
        System.out.println("存款成功");
        System.out.println("当前余额为:" + money);
    }
    // 03取款
    public void takeOutMoney(double num) {
        if (money >= num) {
            money -= num;
            System.out.println("取款成功");
            System.out.println("当前余额为:" + money);
        }else {
            System.out.println("余额不足");
            System.out.println("当前余额为:" + money);
        }
    }
}
