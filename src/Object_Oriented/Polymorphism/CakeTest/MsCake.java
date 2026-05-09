package Object_Oriented.Polymorphism.CakeTest;
// 慕斯蛋糕
public class MsCake extends Cake {

    @Override
    public void getCake(String type, int size) {
        System.out.println(size+"寸"+type+"蛋糕");
    }
}
