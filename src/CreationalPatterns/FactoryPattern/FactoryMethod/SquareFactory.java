package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Shape;
import CreationalPatterns.FactoryPattern.Square;

public class SquareFactory extends ShapeFactory {
    @Override
    protected Shape makeShape() {
        return new Square();
    }
}
