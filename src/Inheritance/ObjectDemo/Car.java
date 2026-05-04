package Inheritance.ObjectDemo;

public class Car {

    //自定义的类也是一种类型
    public String brand;
    public String color;
    public int price;

    public Car(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            if (((Car) obj).brand == this.brand) {
                return true;
            } else {
                return false;
            }
        }else return false;
    }
}
