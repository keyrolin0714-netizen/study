package JDBC.senior.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/*
    JDBC工具类(V2.0)
        1.维护一个连接池对象,同时维护一个线程绑定变量的ThreadLocal对象
        2.对外提供在ThreadLocal中获取连接的方法
        3.对外提供回收连接的方法,回收过程中,将要回收的方法从ThreadLocal中移除
    注意:工具类仅对外提供共性的功能代码,所以方法均为静态方法
    注意:使用ThreadLocal就是为了一个线程在多长数据库操作过程中,使用的是同一个连接!
 */
public class JDBCUtilV2 {
    // 创建连接池引用,因为要提供给当前项目的全局使用,所以创建为静态的
    private static DataSource dataSource;
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();

    // 在项目启动时,即创建连接池对象,赋值给dataSource
    static {
        try {
            Properties properties = new Properties();
            InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(inputStream);

            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 对外提供在连接池中获取连接的方法
    public static Connection getConnection(){
        try {
            // 在ThreadLocal中获取Connection
            Connection connection = threadLocal.get();
            // threadLocal中没有存储Connection
            if(connection == null){
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            }
            return connection;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // 对外提供回收连接的方法
    public static void release(){
        try {
            Connection connection = threadLocal.get();
            if(connection != null){
                // threadLocal中移除当前已经存储的Connection对象
                threadLocal.remove();
                // 如果开启了事务的手动提交,操作完毕后,归还给连接池之前,要将事务的自动提交改为true
                connection.setAutoCommit(true);
                // 将Connection对象归还给连接池
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
