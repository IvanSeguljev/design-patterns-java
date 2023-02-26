package CreationalPatterns.FactoryPattern.Factory;

import CreationalPatterns.FactoryPattern.Square;
import CreationalPatterns.FactoryPattern.Triangle;

public class ShapeFactory {
    public Square sqareFactory(){
        return new Square();
    }
    public Triangle triangleFactory(){
        return new Triangle();
    }
}
