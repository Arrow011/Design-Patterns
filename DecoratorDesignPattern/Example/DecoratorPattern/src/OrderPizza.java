import Pizza.BasePizza;
import Pizza.Farmhouse;
import Pizza.Margherita;
import Pizza.VegieDelight;
import Toppings.ExtraCheese;
import Toppings.Mushroom;
import Toppings.Toppings;

public class OrderPizza {
    
    public static void main(String[] args) {
        BasePizza vegieDelightPizza = new VegieDelight();
        BasePizza margheritaPizza = new Margherita();
        BasePizza farmhousePizza =  new Farmhouse();

        Toppings vegDelightWithExtraCheese = new ExtraCheese(vegieDelightPizza);
        Toppings margheritaWithMushroom = new Mushroom(margheritaPizza);
    
        

        System.out.println(vegDelightWithExtraCheese.cost());
        System.out.println(margheritaWithMushroom.cost());
        System.out.println(new ExtraCheese(farmhousePizza).cost());
        System.out.println(farmhousePizza.cost());
        System.out.println(new ExtraCheese(new Mushroom(farmhousePizza)).cost());
    }
}
