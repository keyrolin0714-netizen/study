package CollectionFramework.LinkedList;

import CollectionFramework.ArrayList.ArryListBook.Book;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList:链表 == 数据 + 指针域
        LinkedList list = new LinkedList();
        Book b1 = new Book("阿泰勒的角落",60,"李娟");
        list.add(b1);
        Book b2 = new Book("你是人间四月天",70,"林徽因");
        Book b3 = new Book("平凡的世界",80,"路遥");
        list.addFirst(b2);
        list.addLast(b3);

        // 获取第一本书
        Book first = (Book) list.getFirst();
        System.out.println(first.getName());
        System.out.println("=========================");

        // 删除
        list.removeFirst();
        list.removeLast();

        // 输出
        for (int i = 0; i < list.size(); i++) {
            Book b = (Book) list.get(i);// 强转?
            System.out.println(b);
        }
    }
}
