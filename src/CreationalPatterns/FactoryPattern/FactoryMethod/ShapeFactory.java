package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Shape;

public abstract class ShapeFactory {
    protected abstract Shape makeShape();

    public Shape getShape(){
        return makeShape();
    }
}
