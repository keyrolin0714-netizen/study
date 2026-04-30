package CommonlyUsedClass.PackagingClass;

import java.util.ArrayList;
import java.util.List;

public class PackageClassDemo {
    public static void main(String[] args) {
        // 包装类
//        Integer num = new Integer(1);
//        Double num2 = new Double(1.2);
//        Character ch = new Character('a');
//        Boolean bool = new Boolean(true);

//        // 从基本类型 --> 包装类型 直接赋值
//        Integer num1 = 1;
//        Double num2 = 1.0;
//        Character ch = 'A';
//        Boolean bool = true;
//
//        // 从包装类型 --> 基本类型
//        int littleNum1 = num1.intValue();
//        double littleNum2 = num2.intValue();
//        char littleCh = ch.charValue();
//        boolean littleBool = bool.booleanValue();

        // JDK5之后,装箱和拆箱是自动完成的
        Integer num1 = 1; // 自动装箱
        int num2 = num1;// 自动拆箱

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);// 自动装箱
    }
}
