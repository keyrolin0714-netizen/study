// 引入输入(文本扫描器)
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建扫描器
        System.out.println("请输入你的名字");
        String name = scanner.nextLine();
        System.out.println("你好" + name);

        System.out.println("请输入你的年纪");
        int age = scanner.nextInt();
        System.out.println(age + 10);

        System.out.println("请输入你的身高");
        double height = scanner.nextDouble();
        System.out.println("你的身高:" + height);
        // 使用'+'连接字符串与其他类型的变量时,将会统一转换成字符串格式
    }
}
