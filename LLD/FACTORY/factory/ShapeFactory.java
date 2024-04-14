package LLD.FACTORY.factory;

import LLD.FACTORY.Circle;
import LLD.FACTORY.Rectangle;
import LLD.FACTORY.Shape;
import LLD.FACTORY.Square;

public class ShapeFactory {
    public Shape getShape(String input){
        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
