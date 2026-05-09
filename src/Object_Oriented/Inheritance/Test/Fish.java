package Object_Oriented.Inheritance.Test;
/* 有多种鱼类,它们的游行速度如下
    白鲨:48km/h
    飞鱼:60km/h
    旗鱼:110km/h
    编写程序根据输入时间计算行驶公里数
 */

// 抽象出Fish类
public abstract class Fish {
    // 抽象类
    int speed;
    //抽象方法
    public abstract int calc(int hours);
}
