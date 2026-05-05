package Interface.Calc;

public class Mul implements Calc {
    @Override
    public double calc(int num1, int num2) {
        return num1*num2;
    }
}
