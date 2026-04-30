package CommonlyUsedClass.StringAndStringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer:可变字符串
        StringBuffer sb = new StringBuffer();
        sb.append("北京");
        sb.append("天津");
        sb.insert(2,"上海");
        String str = sb.toString();
        System.out.println(str);
    }
}
