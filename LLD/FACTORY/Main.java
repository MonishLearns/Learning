package Learning.LLD.FACTORY;

import Learning.LLD.FACTORY.factory.ShapeFactory;

public class Main {
    public static void main(String[] args){
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("SQUARE");
        if(shapeObj!=null){
            shapeObj.draw();
        }
    }
}
