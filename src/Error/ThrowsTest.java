package Error;

public class ThrowsTest {

    public  static void calc() throws ArithmeticException,Exception {
        System.out.println(5/0);
    }

    public static void main(String[] args) throws Exception {
        // throws的使用
        try {
            calc();
        } catch (Exception e) {
            System.out.println("除数不能为0");
        }
    }
}
