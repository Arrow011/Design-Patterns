package strategy;
public class Car implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Drive by car");
    }

}