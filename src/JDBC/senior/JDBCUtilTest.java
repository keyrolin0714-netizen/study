package JDBC.senior;

import JDBC.senior.util.JDBCUtil;
import JDBC.senior.util.JDBCUtilV2;
import org.junit.Test;

import java.sql.Connection;
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
}
