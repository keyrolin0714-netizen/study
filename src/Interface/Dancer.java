package Interface;
// 定义舞蹈家类
// 类与接口之间的关系,实现
public class Dancer implements Dance {
    // 实现接口的所有方法
    @Override
    public void dance() {
        System.out.println("舞蹈家跳舞");
    }
}
