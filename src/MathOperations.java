public class MathOperations {
    public static void main(String[] args) {
        int x = 10;// 整数与整数做运算时结果只能是整数
        int y = 20;
        // System.out.println(x%3);
        x = x + 1;
//        x += 1;
//        x -= 2;
//        x *= 3;
//        x /= 4;
//        System.out.println(Math.max(x,y));// 取两个数中较大的值
//        System.out.println(Math.min(x,y));// 取两个数中较小的值
//        System.out.println(Math.pow(x, y));// 数学运算:x的y次方
//        System.out.println(Math.round(3.666));// 做四舍五入
//        System.out.println(Math.ceil(3.666));// 无条件进位
//        System.out.println(Math.floor(3.666));// 无条件舍去
        System.out.println(Math.round(3.666 * 100) / 100.0);// 四舍五入到小数点后第几位
    }
}
