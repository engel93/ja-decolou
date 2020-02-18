package dao;

import model.SalesOrderItem;

public class SalesOrderItemDAO extends DAO<SalesOrderItem> {

    @Override
    protected String getSqlString() {
        return "select s from SalesOrderItem s";
    }

    @Override
    protected Class getClassName() {
        return SalesOrderItem.class;
    }
}
