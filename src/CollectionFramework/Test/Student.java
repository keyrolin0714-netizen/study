package CollectionFramework.Test;
// 学生类
public class Student {

    private String stuNo;

    private String stuName;

    private int stuAge;

    public Student(){
        // 无参构造
    }

    public Student(String stuNo, String stuName, int stuAge) {
        // 带参构造
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
}
