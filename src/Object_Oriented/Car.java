package Object_Oriented;

public class Car {
    // 品牌
    String brand;
    // 颜色
    String color;
    // 价格
    double price;

    // 自我介绍的方法
    public void show(){
        System.out.println("我是一辆" + color + "的" + brand + ",价格是" + price + "万元");
    }
}
