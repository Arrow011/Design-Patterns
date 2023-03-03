package factory;
import product.Vehicle;

public interface VehicleFactory {
    
    public Vehicle getVehicle(String input);
}
