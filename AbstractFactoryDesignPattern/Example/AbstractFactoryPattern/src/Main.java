import factory.AbstractFactory;
import factory.VehicleFactory;
import product.Vehicle;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();

        VehicleFactory luxuryVehicleFactory = abstractFactory.getVehicleFactory("luxury");
        VehicleFactory ordinaryVehicleFactory = abstractFactory.getVehicleFactory("ordinary");

        luxuryVehicleFactory.getVehicle("Mercedes").drive();;
        ordinaryVehicleFactory.getVehicle("Honda").drive();
    }
}
