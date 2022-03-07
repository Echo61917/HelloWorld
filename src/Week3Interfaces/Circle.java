package Week3Interfaces;


public class Circle extends GeometricObject2D {

    //Field
    private double radius;

    //Constructor
    public Circle(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter()
    {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString()
    {
        return "Circle's Color: " + super.color + "\n" + "Circle's Filled Property: " + super.filled + "\n" + "Circle's Radius: "
                + this.radius + "\n" + "Circle's Area: " + getArea() + "\n" + "Circle's Perimeter: " + getPerimeter();
    }

}
