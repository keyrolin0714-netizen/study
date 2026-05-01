package Object_Oriented;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "红旗";
        car1.color = "红色";
        car1.price = 30.6;

        Car car2 = new Car();
        car2.brand = "阿斯顿马丁";
        car2.color = "白色";
        car2.price = 120.8;

        car1.show();
        car2.show();
    }
}
