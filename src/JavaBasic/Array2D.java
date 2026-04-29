package JavaBasic;

// 2D array 二维数组
public class Array2D {
    public static void main(String[] args) {

        int[][] numsTest = new int[3][3];
        numsTest[0][0] = 10;
        numsTest[0][1] = 20;
        numsTest[0][2] = 30;
        System.out.println(numsTest[0][0]);
        int[][] nums = {
                            {10,20,30},
                            {40,50,60},
                            {70,80,90},
                            {90,100,110},
                       };
        nums[2][1] = 100;
        System.out.println(nums[1][2]);
    }
}
