package CreationalPatterns.FactoryPattern.AbstractFactory;

import CreationalPatterns.FactoryPattern.Shape;
import CreationalPatterns.FactoryPattern.Square;

public class SquareFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Square();
    }
}
