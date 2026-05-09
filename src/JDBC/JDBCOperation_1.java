package JDBC;

import org.junit.Test;

import java.sql.*;

public class JDBCOperation_1 {
    @Test
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
}
