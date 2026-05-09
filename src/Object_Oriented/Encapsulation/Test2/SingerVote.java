package Object_Oriented.Encapsulation.Test2;

// 模拟实现歌星投票过程:每个网民只允许投一次票
// 并且当投票总数达到1000时就停止投票

// 定义一个投票类
public class SingerVote {
    // 三个属性
    // 投票的次数
    static int count;
    // 投票的最大次数
    public static final int max_votes = 1000; // 常量
    // 投票人
    public String name;

    public SingerVote(){

    }

    public SingerVote(String name){
        this.name = name;
    }
    // 投票的方法
    public void vote() {
        // 如果投票到达了上限,提示投票结束
        if (count < max_votes) {
            count++;
        }else {
            System.out.println("投票已经结束,停止投票");
        }
    }

    public static void show(){
        System.out.println("目前" + count + "票");
    }
}
