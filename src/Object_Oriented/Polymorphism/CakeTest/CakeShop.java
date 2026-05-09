package Object_Oriented.Polymorphism.CakeTest;
// 蛋糕店类
public class CakeShop {
    // 根据客户要求定制对应尺寸和类型的蛋糕
    // 生产蛋糕  返回一个具体的蛋糕类型
    public Cake makeCake(String type) {
        Cake cake = null;
        if (type.equals("慕斯")) {
            cake = new MsCake();
        } else if (type.equals("泡芙")) {
            cake = new PfCake();
        } else if (type.equals("红丝绒")){
            cake = new HSRCake();
        }
        return cake;
    }
}
