package CommonlyUsedClass;

public class EnumDemo {
    public static void test(WeekDay day){
        switch (day){
            case MONDAY:
                System.out.println("周一");
                break;
            case TUESDAY:
                System.out.println("周二");
                break;
            case WEDNESDAY:
                System.out.println("周三");
                break;
            case THURSDAY:
                System.out.println("周四");
                break;
            case FRIDAY:
                System.out.println("周五");
                break;
            case SATURDAY:
                System.out.println("周六");
                break;
            case SUNDAY:
                System.out.println("周日");
                break;
            // 枚举值不可能取到其他的值,故可以省略default
        }
    }
    public static void main(String[] args) {
        int num1 = 1;
        double num2 = 1.1;
        WeekDay day = WeekDay.FRIDAY;
        test(day);
    }
}
