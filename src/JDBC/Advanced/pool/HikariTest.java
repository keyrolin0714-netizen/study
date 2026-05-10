package JDBC.Advanced.pool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class HikariTest {
    @Test
    public void testHardCodeHikari() throws Exception {
        /*
            硬编码:将连接池的配置信息和Java代码耦合在一起
            1.创建HikariDataSource连接池对象
            2.设置连接池的配置信息[必要 | 非必要]
            3.通过连接池获取连接对象
            4.回收连接
         */

        // 1.创建HikariDataSource连接池对象
        HikariDataSource ds = new HikariDataSource();
        // 2.设置连接池的配置信息[必须 | 非必须]
        // 必须
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/at_guigu");
        ds.setUsername("root");
        ds.setPassword("0000");

        // 非必须
        ds.setMinimumIdle(10);
        ds.setMaximumPoolSize(20);

        // 3.通过连接池获取连接对象
        Connection connection = ds.getConnection();
        System.out.println(connection);

        // 4.回收连接
        connection.close();



    }

    @Test
    public void testResourcesHikari() throws Exception {
        // 1.创建Properties集合,用于存储外部配置文件的key和value值
        Properties properties = new Properties();
        // 2.读取外部配置文件,获取输入流,加载到Properties集合里
        InputStream resourceAsStream = HikariTest.class.getClassLoader().getResourceAsStream("hikari.properties");
        properties.load(resourceAsStream);
        // 3.创建HikariConfig连接池配置对象,将Properties集合传进去
        HikariConfig config = new HikariConfig(properties);
        // 4.基于HikariConfig创建连接池对象,构建HikariDataSource
        HikariDataSource ds = new HikariDataSource(config);
        // 5.获取连接
        Connection connection = ds.getConnection();
        System.out.println(connection);
        // 6.回收连接
        connection.close();

    }
}
