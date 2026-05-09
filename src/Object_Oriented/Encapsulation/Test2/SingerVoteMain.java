package Object_Oriented.Encapsulation.Test2;

public class SingerVoteMain {
    public static void main(String[] args) {
        SingerVote vote = new SingerVote("张三");
        SingerVote vote2 = new SingerVote("李四");


        SingerVote.show();
        vote.vote();
        vote2.vote();
        SingerVote.show();
    }



}
