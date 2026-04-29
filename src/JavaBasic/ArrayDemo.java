package JavaBasic;

// array 数组
public class ArrayDemo {
    public static void main(String[] args) {
        String name1 = "小白";
        String name2 = "小黑";
        String name3 = "小辉";

        String[] names = new String[4];//设定数组大小
        //String[] names = {name1,name2,name3};
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;
        //int[] scores = {60,70,80};
        int[] scores = new int[6];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 100;
        double[] height = {160.5,170.8,185.2};
        height[0] = 174.5;
        System.out.println(names[3]);
    }
}
