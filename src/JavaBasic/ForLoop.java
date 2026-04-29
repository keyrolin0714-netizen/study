package JavaBasic;

public class ForLoop {
    public static void main(String[] args) {
        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        for (i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int sum = 0;
//        for (i = 0; i <= 100; i++) {
//            sum+=i;
//        }
//        System.out.println(sum);

        int[] nums = {10,20,30};
//        for(i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
        for(int num:nums){
            System.out.println(num);
        }
    }
}
