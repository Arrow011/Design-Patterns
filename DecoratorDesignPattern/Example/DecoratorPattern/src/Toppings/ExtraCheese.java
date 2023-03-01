package Toppings;
import Pizza.BasePizza;

public class ExtraCheese extends Toppings{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 25;
    }
    
}
