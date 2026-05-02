package Object_Oriented.MethodDemo;

import java.util.Scanner;

public class BookMain {

    public static void menu(){
        System.out.println("欢迎来到图书管理系统");
        System.out.println("1.图书列表");
        System.out.println("2.添加图书");
        System.out.println("请输入对应操作,输入数字即可");
    }

    public static void main(String[] args) {
        menu();
        Book book = new Book();
        BookMgr bookMgr = new BookMgr();
        bookMgr.initBooks();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != 0){// 退出程序
            if (num == 1) {
                // 图书列表
                bookMgr.booklist();
                menu();
                num = sc.nextInt();
            }else if (num == 2) {
                // 添加操作
                System.out.println("这里是添加图书界面");
                System.out.println("请输入图书名称:");
                book.bookName = sc.next();
                System.out.println("请输入图书作者:");
                book.bookAuthor = sc.next();
                System.out.println("请输入图书价格:");
                book.price = sc.nextInt();
                boolean flag = bookMgr.addbook(book);
                if (flag == true){
                    System.out.println("添加成功");
                }else {
                    System.out.println("添加失败");
                }
                menu();
                num = sc.nextInt();
            }else if (num == 0) {
                break;
            }
            System.out.println("感谢您使用该系统");
        }

    }
}
