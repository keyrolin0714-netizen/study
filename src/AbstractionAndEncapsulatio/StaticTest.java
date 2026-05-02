package AbstractionAndEncapsulatio;

public class StaticTest {
    static int num = 100;
    static {
        num+=100;
        System.out.println(num);
    }
    static {
        num+=500;
        System.out.println(num);
    }
}
