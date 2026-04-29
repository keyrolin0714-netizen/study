package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 类与类之间的关系叫做继承,接口与接口之间的关系也叫继承
        // 类与接口之间的关系叫做实现
        // 定义集合对象
        ArrayList list = new ArrayList();
        // 添加元素
        list.add(1);
        list.add("你好");
        // 插入元素
        list.add(1,1.1);
        // remove(int index)
        list.remove(0);
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
