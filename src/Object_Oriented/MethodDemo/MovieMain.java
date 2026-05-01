package Object_Oriented.MethodDemo;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "让子弹飞";
        movie.director = "姜文";
        String[] actors = new String[5];
        actors[0] = "姜文";
        actors[1] = "葛优";
        actors[2] = "周润发";
        actors[3] = "周韵";
        actors[4] = "姜武";
        movie.initActors(actors);
        movie.show();

        Movie movie2 = new Movie();
        movie2.name = "霸王别姬";
        movie2.director = "陈凯歌";
        String[] actors2 = new String[5];
        actors2[0] = "张国荣";
        actors2[1] = "张丰毅";
        actors2[2] = "巩俐";
        actors2[3] = "葛优";
        actors2[4] = "吕齐";
        movie2.initActors(actors2);
        movie2.show();

    }
}
