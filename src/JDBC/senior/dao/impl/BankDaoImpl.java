package JDBC.senior.dao.impl;

import JDBC.senior.dao.BankDAO;
import JDBC.senior.dao.BaseDAO;

public class BankDaoImpl extends BaseDAO implements BankDAO {

    @Override
    public int addMoney(Integer id, Integer money) {
        try {
            String sql = "update t_bank set money=money+? where id=?";
            return executeUpdate(sql,money,id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int subMoney(Integer id, Integer money) {
        try {
            String sql = "update t_bank set money=money-? where id=?";
            return executeUpdate(sql,money,id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
