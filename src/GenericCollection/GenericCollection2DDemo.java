package GenericCollection;

import CollectionFramework.ArrayList.ArryListBook.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class GenericCollection2DDemo {
    public static void main(String[] args) {
        // 用图书的名称作为key,图书对象作为value
        Map<String,Book> map = new HashMap<String,Book>();
        Book b1 = new Book("阿泰勒的角落",60,"李娟");
        Book b2 = new Book("你是人间四月天",70,"林徽因");
        // 添加元素
        map.put(b1.getName(),b1);
        map.put(b2.getName(),b2);
        // 遍历:优化
        // for
        // 所有key的集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Book value = map.get(key);
            System.out.println(key + ":" + value.getAuthor());
        }

        // 泛型Map集合,打印所有元素,第二种方案,通过获取所有值的集合
        Collection<Book> values = map.values();
        for (Book value : values) {
            System.out.println(value);
        }

        // 通过key + value的方式 k + v = entry
        Set<Map.Entry<String, Book>> entries = map.entrySet();
        for (Map.Entry<String, Book> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // 通过stream方式进行遍历(了解即可)
        Stream<Map.Entry<String, Book>> stream = map.entrySet().stream();
        stream.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
