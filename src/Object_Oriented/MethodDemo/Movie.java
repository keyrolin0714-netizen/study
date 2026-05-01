package Object_Oriented.MethodDemo;

// 定义一个电影类
public class Movie {
    String name;
    String director;
    String[] actors;

    // 写一个可以给演员数组赋值的方法
    public void initActors(String[] acts) {
        actors = acts;
    }

    // 介绍影片阵容的一个方法
    public void show(){
        System.out.println("电影名称为:"+name);
        System.out.println("导演为:"+director);
        System.out.println("演员为:");
        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i]);
        }
    }
}
