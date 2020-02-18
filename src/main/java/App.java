import dao.*;
import model.Vehicle;

public class App {

    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();

        SalesOrderDAO salesOrderDAO = new SalesOrderDAO();

        SalesOrderItemDAO tourType = new SalesOrderItemDAO();

        TravelDAO travelDAO = new TravelDAO();

        VehicleDAO vehicleDAO = new VehicleDAO();
        vehicleDAO.save(new Vehicle(null, "teste","teste"));


    }

}