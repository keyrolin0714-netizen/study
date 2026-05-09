package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCInjection {
    public static void main(String[] args) throws Exception {
        // 1.注册驱动

        // 2.获取连接对象
        String url = "jdbc:mysql://localhost:3306/at_guigu";
        String user = "root";
        String password = "0000";
        Connection conn = DriverManager.getConnection(url, user, password);

        // 3.获取执行SQL语句的对象
        Statement stmt = conn.createStatement();

        // 动态
        System.out.println("请输入员工姓名:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        // 4.编写SQL语句并执行,接受返回的结果
        String sql = "SELECT emp_id,emp_name,emp_salary,emp_age FROM t_emp WHERE emp_name = '"+ name +"'";
        ResultSet resultSet = stmt.executeQuery(sql);

        // 5.遍历
        while (resultSet.next()) {
            int empId = resultSet.getInt("emp_id");
            String empName = resultSet.getString("emp_name");
            double empSalary = resultSet.getDouble("emp_salary");
            int empAge = resultSet.getInt("emp_age");
            System.out.println(empId + "\t" + empName + "\t" + empSalary + "\t" + empAge);
        }

        // 6.释放资源
        resultSet.close();
        stmt.close();
        conn.close();
    }
}
