package JDBC.senior.dao.impl;

import JDBC.senior.dao.BaseDAO;
import JDBC.senior.dao.EmployeeDao;
import JDBC.senior.pojo.Employee;

import java.util.List;

public class EmployeeDaoImpl extends BaseDAO implements EmployeeDao {

    @Override
    public List<Employee> selectAll() {
        // 1.注册驱动
        // 2.获取连接
        // 3.预编译SQL语句
        // 4.为占位符赋值,执行SQL,接受返回结果
        // 5.处理结果
        // 6.释放资源
        try {
            String sql = "select emp_id empId,emp_name empName,emp_salary empSalary,emp_age empAge from t_emp";
            return executeQuery(Employee.class,sql,null);//?
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee selectById(Integer empId) {
        try {
            String sql = "select emp_id empId,emp_name empName,emp_salary empSalary,emp_age empAge from t_emp where emp_id = ?";
            return executeQueryBean(Employee.class,sql,empId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insert(Employee employee) {
        try {
            String sql = "INSERT INTO t_emp (emp_name,emp_salary,emp_age) VALUES (?,?,?)";
            return executeUpdate(sql,employee.getEmpName(),employee.getEmpSalary(),employee.getEmpAge());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int update(Employee employee) {
        try {
            String sql = "UPDATE t_emp SET emp_salary = ? WHERE emp_id = ?";
            return executeUpdate(sql,employee.getEmpSalary(),employee.getEmpId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int delete(Integer empId) {
        try {
            String sql = "DELETE FROM t_emp WHERE emp_id = ?";
            return executeUpdate(sql,empId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
