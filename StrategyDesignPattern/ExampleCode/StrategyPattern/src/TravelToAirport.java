import strategy.DriveStrategy;

public class TravelToAirport{

    public DriveStrategy driveStrategy;
    
    public TravelToAirport(DriveStrategy vs){
        this.driveStrategy = vs;
    }

    public void drive(){
        driveStrategy.drive();
    }
    
}