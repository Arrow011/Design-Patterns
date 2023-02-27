package strategy;
public class Bicycle implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Drive via bicycle.");
    }
    
}
