package CollectionFramework.Test;

import java.util.Scanner;

public class StudentSys {
    public static void main(String[] args) {
        // 实例化一个学生管理类
        StudentMgr mgr = new StudentMgr();
        // 准备学生对象
        Scanner input = new Scanner(System.in);
        String yesOrNo = "y"; // 默认代表可以继续添加
        while(yesOrNo.equals("y")){
            System.out.println("请输入学号: ");
            String stuNo = input.next();
            System.out.println("请输入姓名:");
            String stuName = input.next();
            System.out.println("请输入年龄:");
            int stuAge = input.nextInt();
            // 实例化一个学生对象
            Student stu = new Student(stuNo, stuName, stuAge);
            boolean flag = mgr.addStudent(stu);
            if (flag){// flag = true
                System.out.println("添加成功");
                System.out.println("还要继续添加吗?(y/n)");
                yesOrNo = input.next();
            }else{
                System.out.println("添加失败");
            }

        }
        mgr.printAll();

    }
    // 实例化一个学生管理类

}
