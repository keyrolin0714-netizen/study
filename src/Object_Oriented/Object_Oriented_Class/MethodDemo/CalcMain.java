package Object_Oriented.Object_Oriented_Class.MethodDemo;

public class CalcMain {
    public static void main(String[] args) {
        CalC calc = new CalC();
        calc.getsum();
        int sum = calc.getsum();// 对返回值进行接收
        System.out.println(sum);
    }
}
