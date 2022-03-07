package Week3Interfaces;

public class Rectangle extends GeometricObject2D {

    //Fields
    private double length;
    private double width;

    //Constructor
    public Rectangle(String color, boolean filled, double length, double width)
    {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea()
    {
        return 2*(length + width);
    }

    @Override
    public double getPerimeter()
    {
        return length * width;
    }

    public String toString()
    {
        return "Rectangle's Color: " + super.color + "\n" + "Rectangle's Filled Property: " + super.filled + "\n" + "Rectangle's Width and Height: " + this.width + ", " + this.length + "\n"
                + "Rectangle's Area: " + getArea() + "\n" + "Rectangle's Perimeter: " + getPerimeter();
    }


}
