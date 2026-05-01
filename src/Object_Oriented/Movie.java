package Object_Oriented;

// 创建一个电影类
public class Movie {
    // 名称
    String title;
    // 导游
    String director;
    // 演员
    String[] actors =  new String[5];

    // 写一个方法给actors赋值
//    public void initDate(){
//        actors[0] = "张三";
//        actors[1] = "李四";
//        actors[2] = "周星驰";
//        actors[3] = "巩俐";
//        actors[4] = "章子怡";
//    }

    // 写一个介绍电影信息的方法
    public void show(){
        System.out.println("电影的名称为:" + title);
        System.out.println("电影的导演为:" + director);
        System.out.println("参演人员为:");
        for (int i = 0; i < actors.length; i++) {
            System.out.println(actors[i]);
        }
    }
}
