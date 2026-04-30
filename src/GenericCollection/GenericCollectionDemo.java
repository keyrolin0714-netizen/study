package GenericCollection;

import CollectionFramework.ArrayList.ArryListBook.Book;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionDemo {
    public static void main(String[] args) {
        // 泛型集合:集合只能保存单一类型的数据,避免了强转的麻烦,代码执行效率更高,且遍历起来比较简单
        List<Book> list = new ArrayList<Book>();
        Book b1 = new Book("阿泰勒的角落",60,"李娟");
        list.add(b1);
        Book b2 = new Book("你是人间四月天",70,"林徽因");
        list.add(0,b2);// 可以根据下标添加
        // 泛型可以保证类型的安全
        for(Book item : list){
            // 使用for增强进行循环遍历
            System.out.println(item);
        }
    }
}
