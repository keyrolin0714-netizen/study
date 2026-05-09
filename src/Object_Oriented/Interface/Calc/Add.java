package Object_Oriented.Interface.Calc;

public class Add implements Calc {

    @Override
    public double calc(int num1, int num2) {
        return num1+num2;
    }
}
