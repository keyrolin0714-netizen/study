package Polymorphism.Test;

public class PersonMain {
    public static void main(String[] args) {
        // 创建三个国家对应的三个人
        Chinese chinese = new Chinese();
        American american = new American();
        Korean korean = new Korean();
        // 新的知识点,对象数组
        Person[] persons = new Person[3];
        persons[0] = chinese;
        persons[1] = american;
        persons[2] = korean;
        // 使用多态,让多个国家的人打招呼
        // 多态的终极价值就是为了实现统一调用
        for (Person person : persons) {
            // person代表每一个变量
            person.sayHello();
        }
    }
}
