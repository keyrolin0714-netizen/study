package CollectionFramework.HashSet;

import CollectionFramework.ArrayList.ArryListBook.Book;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet : 唯一的,无序的
        Set set = new HashSet();

        Book b1 = new Book("阿泰勒的角落",60,"李娟");
        Book b2 = b1;// 将地址给到b2,此时b1和b2在栈中指向同一个堆中的对象
        set.add(b1);
        set.add(b2);
        // Set中存放对象的引用,无法存储两个相同的对象
        System.out.println(set.size());
    }
}
