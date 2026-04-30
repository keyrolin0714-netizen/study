package CommonlyUsedClass.StringAndStringBuffer;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        //String本质上是一个类,且由final关键字修饰为最终类,不能被继承
//        String str1 = "java";
//        String str2 = new String("java");
//        System.out.println(str1);
//        System.out.println(str2);

        //length():获取字符串长度
        String word = "最近,有一本书火了,<毛泽东选集>";
        int len = word.length();
        System.out.println(len);

        //equals():两个字符串内容是否相同
        /*String str1 = "java";
        //String str2 = "java";
        Scanner sc = new Scanner(System.in);
        String str2 = sc.nextLine();
        if (str1==str2) {
        //if (str1.equals(str2)) {
            System.out.println("相同");
        }else {
            System.out.println("不相同");
        }*/

        //equalsignorecase():忽略大小写的字符串比较
        /*Scanner sc = new Scanner(System.in);
        final String UNAME = "happy",UPWD = "www666";// final不可变
        System.out.println("请输入用户名:");
        String uName = sc.next();
        System.out.println("请输入密码:");
        String uPwd = sc.next();
        if (uName.equals(UNAME) && uPwd.equalsIgnoreCase(UPWD)) {
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }*/

        //toLowerCase() toUpperCase 转小写和转大写
        /*String str = "ABCDefgHI";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());*/

        //concat() 连接字符串
        /*String str1 = "Hello";
        String str2 = "World";
        //String str = str1 + str2;
        String str = str1.concat(str2);
        System.out.println(str);*/

        //indexOf():搜索第一个出现的字符串value,如果没有找到返回-1
        //lastIndexOf():搜索最后一个出现的字符串value,如果没有找到返回-1
        /*String str = "我爱中国,我爱北京,我爱天安门";
        int index1 = str.indexOf("爱");
        System.out.println(index1);
        int index2 = str.lastIndexOf("爱");
        System.out.println(index2);*/

        // substring(int index):字符串截取
        /*String str = "我爱你中国,我爱你北京,我爱你天安门";
        String subString = str.substring(6);
        System.out.println(subString);*/

        // substring(int beginindex,int endindex)
        /*String str = "我爱你中国,我爱你北京,我爱你天安门";
        String subString = str.substring(6,7);
        System.out.println(subString);*/

        // trim():移除字符串前后空格
        /*String str = "   www   ";
        String trim = str.trim();
        System.out.println(trim);*/

        // replace(char oldChar,char newChar)
        /*String str = "我爱中国,我爱北京,我爱天安门";
        String replace = str.replace("我","你");
        System.out.println(replace);*/

        // replace(CharSequence target,CharSequence replacement)
        /*String str = "我爱中国,我爱北京,我爱天安门";
        String replace = str.replace("我爱","你真爱");
        System.out.println(replace);*/

        // split(String regex):字符串分割
        String str = "T01:T02:T03:T04";
        String[] strs = str.split(":");
        for (String item : strs) {
            System.out.println(item);
        }
    }
}
