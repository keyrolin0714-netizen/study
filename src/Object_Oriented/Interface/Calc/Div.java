package Object_Oriented.Interface.Calc;

public class Div implements Calc {
    @Override
    public double calc(int num1, int num2) {
        if (num2 != 0) {
            return num1*1.0 / num2;
        }else{
            return 0;
        }
    }
}
