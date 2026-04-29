package JavaBasic;

// 循环嵌套
public class NestedLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(i + "," + j);
//            }
//        }
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        for(int [] num:nums){
            for(int num1:num){
                System.out.println(num1);
            }
        }
    }
}
