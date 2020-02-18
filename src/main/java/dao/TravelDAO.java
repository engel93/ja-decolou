package dao;

import model.Travel;

public class TravelDAO extends DAO<Travel> {

    @Override
    protected String getSqlString() {
        return "select s from Travel s";
    }

    @Override
    protected Class getClassName() {
        return Travel.class;
    }
}
