import factory.ShapeFactory;
import product.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("triangle");
        shape.draw();
    }
}
