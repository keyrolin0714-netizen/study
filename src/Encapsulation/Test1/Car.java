package Encapsulation.Test1;

// 运用面向对象思想抽象出Car类,汽车有品牌,型号,生产年份,行驶里程数
// 对行驶里程数进行封装,保证数据的有效性,使用带参构造对属性进行赋值
public class Car {
    // 属性
    String brand;
    String model;
    int year;
    private double mile;

    // 两个构造方法
    public Car(){

    }
    // 带三个参数的构造
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public double getMile() {
        return mile;
    }

    public void setMile(double mile) {
        if (mile < 0)
            mile = 0;
        else{
            this.mile = mile;
        }
    }

    public void show(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mile: " + mile);
    }

}
