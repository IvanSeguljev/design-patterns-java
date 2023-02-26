package CreationalPatterns.FactoryPattern.FactoryMethod;

import CreationalPatterns.FactoryPattern.Shape;
import CreationalPatterns.FactoryPattern.Triangle;

public class TriangleFactory extends ShapeFactory {
    @Override
    protected Shape makeShape() {
        return new Triangle();
    }
}
