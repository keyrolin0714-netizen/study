package Object_Oriented.Inheritance.Test;

public class FishMain {
    public static void main(String[] args) {
        // 组织整个的代码
        // 父类变量保持子类对象
        Fish fish1 = new Shark(48);
        Fish fish2 = new FlyingFish(60);
        Fish fish3 = new Sailfish(110);

        // 计算游行的记录
        int num1 = fish1.calc(3);
        System.out.println("白鲨游行的公里数为: " + num1);
        int num2 = fish2.calc(5);
        System.out.println("飞鱼游行的公里数为: " + num2);
        int num3 = fish3.calc(7);
        System.out.println("旗鱼游行的公里数为: " + num3);
    }
}
