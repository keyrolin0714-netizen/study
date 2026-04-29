package Error;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) {
        // 异常分为两大类:
        // 1️⃣检查异常:必须强制处理
        // 2️⃣运行时异常
        System.out.println(5/0);// 运行时异常
        // 读取文件,文件可能不存在
        File file = new File("d://error.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.err.println("文件不存在");
        }
    }
}
