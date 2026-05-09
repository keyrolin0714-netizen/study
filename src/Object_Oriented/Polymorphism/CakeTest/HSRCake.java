package Object_Oriented.Polymorphism.CakeTest;

public class HSRCake extends Cake {

    @Override
    public void getCake(String type, int size) {
        System.out.println(size+"寸"+type+"蛋糕");
    }
}
