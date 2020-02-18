package dao;

import model.Vehicle;

public class VehicleDAO extends DAO<Vehicle> {

    @Override
    protected String getSqlString() {
        return "select s from Vehicle s";
    }

    @Override
    protected Class getClassName() {
        return Vehicle.class;
    }
}
