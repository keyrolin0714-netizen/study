package JavaBasic;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                //break;
                continue;
            }
            System.out.println(i);
        }
        int j = 0;
        while (j < 10){
            if (j == 5){
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
