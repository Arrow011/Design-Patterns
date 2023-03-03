package factory;

public class AbstractFactory {
    
    public VehicleFactory getVehicleFactory(String input){
        VehicleFactory vehicleFactory = null;
        switch(input){
            case "luxury":
                vehicleFactory = new LuxuryVehicleFactory();
                break;
            case "ordinary":
                vehicleFactory = new OrdinaryVehicleFactory();
                break;
        }
        return vehicleFactory;
    }
}
