package CollectionFramework.ArryListBook;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBook {
    public static void main(String[] args) {
        // 定义一个集合,保存多本图书信息
        List list = new ArrayList();
        Book b1 = new Book("阿泰勒的角落",60,"李娟");
        Book b2 = new Book("你是人间四月天",70,"林徽因");
        list.add(b1);
        list.add(b2);

        // 插入图书
        Book b3 = new Book("平凡的世界",80,"路遥");
        list.add(1,b3);

        // 删除图书
        list.remove(b1);

        // 是否存在某个元素
        if (list.contains(b2)){
            System.out.println("存在该图书");
        }else{
            System.out.println("不存在该图书");
        }

        for (int i = 0; i < list.size(); i++) {
            Book b = (Book) list.get(i);// 强转?
            System.out.println(b);
        }
    }
}

