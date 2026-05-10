package JDBC.senior.dao.impl;

import JDBC.senior.dao.EmployeeDao;
import JDBC.senior.pojo.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public List<Employee> selectAll() {
        // 1.注册驱动
        // 2.获取连接
        // 3.预编译SQL语句
        // 4.为占位符赋值,执行SQL,接受返回结果
        // 5.处理结果
        // 6.释放资源
        return List.of();
    }

    @Override
    public Employee selectById(Integer empId) {
        return null;
    }

    @Override
    public int insert(Employee employee) {
        return 0;
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public int delete(Integer empId) {
        return 0;
    }
}
