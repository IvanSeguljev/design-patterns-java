package CreationalPatterns.FactoryPattern.AbstractFactory;

import CreationalPatterns.FactoryPattern.Shape;
import CreationalPatterns.FactoryPattern.Triangle;

public class TriangleFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Triangle();
    }
}
