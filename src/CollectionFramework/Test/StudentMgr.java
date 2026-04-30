package CollectionFramework.Test;

import java.util.ArrayList;
import java.util.List;

//学生管理类:提供添加和查询的方法
public class StudentMgr {
    // 01.定义一个泛型集合保存所有学生信息
    List<Student> list = new ArrayList<Student>();

    // 02.添加学生
    public boolean addStudent(Student stu) {
        boolean flag = list.add(stu);
        return flag;
    }

    // 03.查询
    public void printAll() {
        for (Student stu : list) {
            System.out.println(stu.getStuNo()+" "+stu.getStuName()+" "+stu.getStuAge());
        }
    }
}
