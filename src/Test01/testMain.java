package Test01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入行数:");
        int i = sc.nextInt();
        System.out.print("请输入列数:");
        int j = sc.nextInt();
        for(int col = 0;col < i;col++){
            for(int row = 0;row < j;row++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
