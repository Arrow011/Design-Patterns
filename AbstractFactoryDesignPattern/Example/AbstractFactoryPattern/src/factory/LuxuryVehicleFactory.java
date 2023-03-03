package factory;

import product.BMW;
import product.LuxuryVehicle;
import product.Mercedes;
import product.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory{
    
    public Vehicle getVehicle(String input){
        Vehicle vehicle = null;
        switch(input){
            case "BMW":
                vehicle = new BMW();
                break;
            case "Mercedes":
                vehicle = new Mercedes();
                break;
        }
        return vehicle;
    }
}
