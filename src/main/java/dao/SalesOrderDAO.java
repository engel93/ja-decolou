package dao;

import model.SalesOrder;

public class SalesOrderDAO extends DAO<SalesOrder> {

    @Override
    protected String getSqlString() {
        return "select s from SalesOrder s";
    }

    @Override
    protected Class getClassName() {
        return SalesOrder.class;
    }
}
