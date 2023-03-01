package Toppings;
import Pizza.BasePizza;

public class Mushroom extends Toppings{
    
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost(){
        return this.basePizza.cost() + 50;
    }
}
