package JDBC.senior.dao;

import JDBC.senior.util.JDBCUtilV2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 将共性的数据库操作代码封装在BaseDAO里
 */
public class BaseDAO {

    /**
     * 通用的增删改的方法
     * @param sql 调用者要执行的SQL语句
     * @param params params SQL语句中的占位符要赋值的参数
     * @return 受影响的行数
     */
    public int executeUpdate(String sql, Object... params) throws Exception {
        // 1.通过JDBCUtilV2获取数据库连接
        Connection connection = JDBCUtilV2.getConnection();
        // 2.预编译SQL语句
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // 3.为占位符赋值,执行SQL,接受返回结果
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                // 占位符从1开始,参数的数组下标从0开始
                preparedStatement.setObject(i+1,params[i]);
            }
        }
        int row = preparedStatement.executeUpdate();
        // 4.释放资源
        preparedStatement.close();
        JDBCUtilV2.release();
        // 5.处理结果
        return row;
    }
}
