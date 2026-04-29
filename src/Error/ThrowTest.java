package Error;

public class ThrowTest {

    public static void divide(int num1,int num2){
        if(num2 == 0){
            // 如果我们需要在程序中主动的抛出异常,可以使用throw
            throw new ArithmeticException("除数不能为0");
        }
        int result = num1 / num2;
    }

    public static void main(String[] args) {
        // throw:抛出异常
        // 注意!!!:一定要跟throw区分开
        try {
            divide(1,0);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
