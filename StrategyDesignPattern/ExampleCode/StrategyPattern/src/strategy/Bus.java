package strategy;
public class Bus implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Travel via bus.");
    }
    
}
