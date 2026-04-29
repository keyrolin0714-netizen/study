public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        while (i < nums.length) {
            //遍历数组
            System.out.println(nums[i]);
            i++;
        }

//        while (i < 10) {
//            System.out.println(i);
//            i++;//i+=1
//        }
//        do{
//            System.out.println(i);
//            i++;
//        }while (i < 15);
    }
}
