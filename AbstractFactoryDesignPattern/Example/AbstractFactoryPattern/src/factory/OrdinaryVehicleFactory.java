package factory;
import product.Honda;
import product.Nano;
import product.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{
    public Vehicle getVehicle(String input){
        Vehicle vehicle = null;
        switch(input){
            case "Nano":
                vehicle = new Nano();
            case "Honda":
                vehicle = new Honda();
        }
        return vehicle;
    }
}
