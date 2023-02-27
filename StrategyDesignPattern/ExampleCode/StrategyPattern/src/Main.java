
public class Main {
    public static void main(String[] args) {
        TravelToAirport travelByCar = new PreferCars();
        TravelToAirport travelByTrain = new PrefersTrain();
        travelByCar.drive();
        travelByTrain.drive();
    }
}
