package designpattern.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("SQUARE");
        shape.draw();
    }
}
