package Object_Oriented.MethodDemo;

public class Clac_03 {
    public int calc(int num1, int num2, char oper){
        int result = 0;
        switch(oper){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0){
                    result = num1 / num2;
                }else {
                    result = -1;// 协议 除数为0
                }
                break;
            default:
                result = -2;// 协议 操作符错误
                break;

        }
        return result;
    }
}
