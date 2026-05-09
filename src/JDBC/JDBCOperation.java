package JDBC;

import org.junit.Test;

import java.sql.*;

public class JDBCOperation {
    @Test
    // 单行单列
    public void testQuerySingleRowAndCol() throws SQLException {
        // 1.注册驱动(可以省略)

        // 2.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/at_guigu", "root", "0000");

        // 3.预编译SQL语句,得到PrepareStatement对象
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT COUNT(*) as count FROM t_emp;");

        // 4.执行SQL语句,获取结果
        ResultSet resultSet = preparedStatement.executeQuery();

        // 5.处理结果(如果自己明确一定只有一个结果,那么resultSet至少要做一次next的判断,才能拿到列的结果)
        if(resultSet.next()){
            int count = resultSet.getInt("count");
            System.out.println(count);
        }
//        while (resultSet.next()) {
//            int count = resultSet.getInt("count");
//            System.out.println(count);
//        }

        // 6.释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

    @Test
    // 单行多列
    public void testQuerySingleRow() throws SQLException {
        // 注册驱动

        // 获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/at_guigu", "root", "0000");

        // 为占位符赋值,预编译SQL语句获得PrepareStatement对象
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT emp_id,emp_name,emp_salary,emp_age FROM t_emp WHERE emp_id = ?");

        // 执行,并接收结果
        preparedStatement.setInt(1, 5);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            int emp_id = resultSet.getInt("emp_id");
            String emp_name = resultSet.getString("emp_name");
            double emp_salary = resultSet.getDouble("emp_salary");
            int emp_age = resultSet.getInt("emp_age");
            System.out.println(emp_id+"\t"+emp_name+"\t"+emp_salary+"\t"+emp_age);
        }

        // 资源释放
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }

}
