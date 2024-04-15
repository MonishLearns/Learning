package Learning.LLD.FACTORY.factory;

import Learning.LLD.FACTORY.Circle;
import Learning.LLD.FACTORY.Rectangle;
import Learning.LLD.FACTORY.Shape;
import Learning.LLD.FACTORY.Square;

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
