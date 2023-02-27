package strategy;
public class Train implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Travelling via train.");
    }
    
}
