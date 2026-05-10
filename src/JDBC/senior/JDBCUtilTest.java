package JDBC.senior;

import JDBC.senior.dao.EmployeeDao;
import JDBC.senior.dao.impl.EmployeeDaoImpl;
import JDBC.senior.pojo.Employee;
import JDBC.senior.util.JDBCUtil;
import JDBC.senior.util.JDBCUtilV2;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;
import java.util.concurrent.Callable;

public class JDBCUtilTest {
    @Test
    public void testGetConnection() {
        Connection connection = JDBCUtil.getConnection();
        System.out.println(connection);
        // CRUD

        JDBCUtil.release(connection);
    }

    @Test
    public void testGetConnectionV2() {
        /*Connection connection1 = JDBCUtil.getConnection();
        Connection connection2 = JDBCUtil.getConnection();
        Connection connection3 = JDBCUtil.getConnection();

        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);*/

        Connection connection1 = JDBCUtilV2.getConnection();
        Connection connection2 = JDBCUtilV2.getConnection();
        Connection connection3 = JDBCUtilV2.getConnection();

        System.out.println(connection1);
        System.out.println(connection2);
        System.out.println(connection3);

    }

    @Test
    public void testEmployeeDao() {
        // 1.创建DAO实现类的对象
        EmployeeDao employeeDao = new EmployeeDaoImpl();

//        // 2.调用查询所有方法
//        List<Employee> employeeList = employeeDao.selectAll();
//
//        // 3.处理结果
//        for (Employee employee : employeeList) {
//            System.out.println("employee:"+employee);
//
//        }
//        // 调用根据id查询单个员工方法
//        Employee employee = employeeDao.selectById(1);;
//        System.out.println("employee = " + employee);
//        // 调用添加员工的方法
//        Employee employee = new Employee(null,"tom",300.65,38);
//        int insert = employeeDao.insert(employee);
//        System.out.println("insert : " + insert);

//        Employee employee = new Employee(20008,"tom",656.65,38);
//        int update = employeeDao.update(employee);
//        System.out.println("update :" + update);

        int delete = employeeDao.delete(20008);
        System.out.println("delete: " + delete);
    }
}
