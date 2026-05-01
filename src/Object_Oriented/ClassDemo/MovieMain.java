package Object_Oriented.ClassDemo;

public class MovieMain {
    public static void main(String[] args) {
        // 电影介绍问题
        // 创建了一部电影
        Movie movie = new Movie();
        movie.title = "让子弹飞2";
        movie.director = "姜文";
        // 给actors属性赋值
        movie.actors[0] = "张三";
        movie.actors[1] = "李四";
        movie.actors[2] = "周星驰";
        movie.actors[3] = "巩俐";
        movie.actors[4] = "章子怡";
        movie.show();
    }
}
