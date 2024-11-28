package Shapes;

public class Square implements Shape {
    private double sides;

    public Square(double sides) {
        this.sides = sides;
    }

    @Override
    public double getArea() {
        return sides * sides;
    }

    @Override
    public double getPerimeter() {
        return 4 * sides;
    }

    @Override
    public void printShapeType() {
        System.out.println("Square");
    }
}