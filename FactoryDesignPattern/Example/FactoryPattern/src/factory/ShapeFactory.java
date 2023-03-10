package factory;
import product.Circle;
import product.Rectangle;
import product.Shape;
import product.Square;
import product.Triangle;

public class ShapeFactory {
    public Shape getShape(String input){
        switch(input){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
        }
        return new Square();
    }
}
