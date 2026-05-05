package Interface;

public class DanceMain {
    public static void main(String[] args) {
        // 综合调度接口和类
        // 定义一个接口数组来保存所有的实现类对象
        Dance[] dances = new Dance[]{new Dancer(), new DanceTeacher()};
        for (Dance dance : dances) {
            // 每一个dance都是一个接口变量,存储的其实都是实现的类的对象
            dance.dance();
        }
    }
}
