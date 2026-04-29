package CollectionFramework.HashMap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap 双列集合 key value
        Map map = new HashMap();
        map.put("CBC","中国建设银行");
        map.put("ABC","中国农业银行");
        map.put("ICBC","中国工商银行");
        // 根据key获取value
        String value = (String)map.get("CBC");
        System.out.println(value);
        // 获取所有key的集合
        Set set = map.keySet();
        System.out.println(set);
        // 获取所有值的集合
        Collection values = map.values();
        System.out.println(values);
        // 打印所有键+值的集合
        System.out.println(map);
        // 统计集合长度
        System.out.println(map.size());
        // containsKey()
        if(map.containsKey("ABC")){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
        // 使用迭代器遍历HashMap
        // 不是所有的对象都是new出来的,可以通过一个对象的方法创建对象
        // set是key的集合
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){//还有下一个元素
            String key = (String)iterator.next();
            String v = (String)map.get(key);
            System.out.println(key + ":" + v);
        }
    }
}
