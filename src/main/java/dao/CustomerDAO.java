package dao;

import model.Customer;

public class CustomerDAO extends DAO<Customer> {
    @Override
    protected String getSqlString() {
        return "select c from Customer c";
    }

    @Override
    protected Class getClassName() {
        return Customer.class;
    }
}
