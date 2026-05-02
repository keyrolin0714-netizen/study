package AbstractionAndEncapsulatio;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        // 对象名.属性名
        cat.name = "咪咪";
        // 对象名.方法名
        Cat.show();
    }
}
