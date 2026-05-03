package Encapsulation;

public class Dog {
    // public -- 公有  private -- 私有
    private String name;
    private int age;
    // 给出一个访问方式
    // 两个方法:都是公开的
    // 赋值
    public void setName(String name){
        this.name = name;
    }
    // 取值
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) { // 证明年龄非法
            age = 0;
        }else {
            this.age = age;
        }
    }
}
