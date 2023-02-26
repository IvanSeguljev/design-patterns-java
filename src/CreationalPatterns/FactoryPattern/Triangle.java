package CreationalPatterns.FactoryPattern;

public class Triangle extends Shape{
    public Triangle(){
        this.sides = 3;
    }

    @Override
    public String toString() {
        return "This is a triange, it has 3 sides";
    }
}
