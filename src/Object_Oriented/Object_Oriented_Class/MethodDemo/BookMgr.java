package Object_Oriented.Object_Oriented_Class.MethodDemo;

public class BookMgr {
    // 维护一个数组,数组的类型,图书类型,对象数组
    Book[] books = new Book[50];

    // 对books数组初始化,给前两项赋值
    public void initBooks() {
        // 构建一个图书对象
        Book book1 = new Book();
        book1.bookName = "毛泽东选集";
        book1.bookAuthor = "毛泽东";
        book1.price = 50;
        books[0] = book1;

        Book book2 = new Book();
        book2.bookName = "活着";
        book2.bookAuthor = "余华";
        book2.price = 60;
        books[1] = book2;
        // 图书对象和数组book进行关联绑定

    }
    // 图书列表
    public void booklist(){
        System.out.println("这里是图书列表");
        System.out.println("书名\t\t作者\t\t价格");
        for(int i = 0; i < books.length; i++){
            if(books[i] != null){
                System.out.println(books[i].bookName + "\t\t" + books[i].bookAuthor + "\t\t" + books[i].price);
            }
        }
    }
    // 添加图书
    public boolean addbook(Book book){// 对象作为参数
        boolean flag = false;
        for(int i = 0; i < books.length; i++){
            if(books[i] == null){
                books[i] = book;
                flag = true;
                break;
            }
        }
        return flag;
    }
}
