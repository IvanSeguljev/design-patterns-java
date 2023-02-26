package CreationalPatterns.FactoryPattern;

public class Square extends Shape{
    public Square(){
        this.sides=4;
    }

    @Override
    public String toString() {
        return "This is a square, it has 4 sides.";
    }
}
