package Object_Oriented;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // 写一个面向对象的登录程序
        // 数组:真实系统中,用户不止一个
        // users数组的每一项保存的都是一个用户对象
        UserInfo[] users = new UserInfo[50];
        // 创建了一个UserInfo的对象
        UserInfo info = new UserInfo();
        info.userName = "迷迭香";
        info.userPwd = "123456";
        users[0] = info;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String uname = sc.nextLine();
        System.out.println("请输入密码:");
        String upwd = sc.nextLine();
        boolean flag = false;// 默认登录失败
        for (int i = 0; i < users.length; i++) {
            // Java中判定一个对象是否为空用null
            // Java中判定两个字符是否相对用.equals()
            if (users[i] != null && users[i].userName.equals(uname) && users[i].userPwd.equals(upwd)) {
                // 代码执行到这里,证明登录成功
                flag = true;
                break;
            }
        }
        // 出了循环,可以判定结果
        if (flag) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }


    }
}
