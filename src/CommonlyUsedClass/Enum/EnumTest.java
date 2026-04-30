package CommonlyUsedClass.Enum;
// 定义学生类,有姓名和性别两个属性,性别定义为枚举类型.
// 实例化一个学生对象,给姓名和性别属性赋值
public class EnumTest {
    public static void main(String[] args) {
        // 实例化一个学生对象
        Student stu = new Student();
        stu.name = "张三";
        stu.sex = Gender.MALE;// 使用枚举限定取值
        System.out.println(stu.name);
        System.out.println(stu.sex);
    }
}
