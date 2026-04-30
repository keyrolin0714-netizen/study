package CommonlyUsedClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        // 日期和时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
}
