/*
逻辑运算符
&&与   ||或   !非(取反)
== 相等   != 不等
字符串相等比较使用.equals()
 */
public class LogicalOperator {
    public static void main(String[] args) {
        int age = 20;
//        System.out.println(20 > age > 10);// Java中不能做连续比较
//        System.out.println(age > 10 && age < 30);
//        System.out.println(30<age || age>10);
//        System.out.println(!(age > 20));
//        System.out.println(age == 21);
//        System.out.println(age != 21);
        //String name = "张嘉鹏";
        String name = new String("张嘉鹏");
        System.out.println(name == "张嘉鹏");
        //对字符串进行判断时,特殊情况下使用'=='会出错,统一使用.equals()
        System.out.println(name.equals("张嘉鹏"));
    }
}
