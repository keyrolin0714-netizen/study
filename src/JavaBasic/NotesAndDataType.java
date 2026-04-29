package JavaBasic;

// Java中的数据类型
public class NotesAndDataType {
    public static void main(String[] args) {
        // 单行注释
        /* 多行注释 */
        /** 文本（文档）注释 */

        // 字符串(String): "小绿" -- Java中' '和" "功能不同
        System.out.println("小绿");
        // 字符型(char): '王'
        System.out.println('王');
        // 整数(int): 18
        System.out.println(18*12);
        // 浮点数(double): 160.5
        System.out.println(160.5);
        // 布尔值(boolean): true false(是|否)(真|假)
        System.out.println(true);

        /*
        整数型
        byte : -128 ~ 127
        short : -32768 ~ 32767
        *int : -2147483648 ~ 2147483647
        long : -9223372036854775808 ~ 9223372036854775807
        注意 :
        1️⃣对long类型的变量赋值要在结尾加上'L'
        2️⃣使用更大范围的变量类型将占用更大的存储空间(通常用int)
        */

        long num1 = 22000000000L;
        System.out.println(num1);

        /*
        浮点数(小数型):
        float : 精确到小数点后7位
        *double : 精确到小数点后15位
         */

        double Num2 = 160.5;
        System.out.println(Num2);
    }
}
