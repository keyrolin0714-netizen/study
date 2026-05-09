package Object_Oriented.Polymorphism.CakeTest;

import java.util.Random;

public class CakeMain {
    public static void main(String[] args) {
        // 客户预定蛋糕
//        Cake msCake = new MsCake();
//        Cake pfCake = new PfCake();
//        Cake hsrCake = new HSRCake();
        // 电脑中
        CakeShop cakeShop = new CakeShop();
        // 蛋糕类型
        String[] types = {"慕斯","泡芙","红丝绒"};
        // 蛋糕尺寸
        int[] sizes = {6,8,10};
        // 为了模拟真实用户的真实定制需求
        // 随机值
        Random rand = new Random();
        for(String type : types){
            Cake cake = cakeShop.makeCake(type);
            int num = rand.nextInt(3);// 0 1 2
            cake.getCake(type,sizes[num]);
        }
    }
}
