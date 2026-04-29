package JavaBasic;

// if 判断句
// 如果 ... 就 ...
public class Conditional_if {
    public static void main(String[] args) {
        // 如果下雨就开车去上班
        boolean rain = false;
        if(rain){
            System.out.println("开车去上班");
        }

        // 如果下雨就开车去上班
        // 否则 走路去上班

        if(rain){
            System.out.println("开车去上班");
        }else {
            System.out.println("走路去上班");
        }

        // 如果大于等于65岁 价格250
        // 或者如果大于18岁 价格300
        // 否则价格200

        int age = 20;
        if(age>=65){
            System.out.println("价格250");
        }else if(age>18){
            System.out.println("价格300");
        }else if(age>10){
            System.out.println("价格280");
        }else if(age>5){
            System.out.println("价格270");
        }else{
            System.out.println("价格200");
        }
    }
}
