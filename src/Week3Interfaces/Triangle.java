package Week3Interfaces;

public class Triangle extends GeometricObject2D {

    //Fields
    private double base;
    private double height;
    private boolean isRight;

    public Triangle(String color, boolean filled, double base, double height, boolean isRight)
    {
        super(color, filled);
        this.base = base;
        this.height = height;
        this.isRight = isRight;
    }

    public double getHypotenuse()
    {
        if (isRight = true)
        {
            return Math.sqrt((base * base + height * height));
        }
        else{
            System.out.println("Triangle must be a right triangle to calculate hypotenuse");
            return 0;
        }
    }


    @Override
    public double getArea() {
        return (base * height)/2;
    }

    @Override
    public double getPerimeter() {
        return base + height + getHypotenuse();
    }


    @Override
    public String toString()
    {
        return "Triangle's Color:" + super.color + "\n" + "Triangle's Filled Property" + super.filled + "\n" +
                "Triangle's Base and Height Values: " + this.base + ", " + this.height + "\n" + "Triangle's Area: " + getArea() + "\n" + "Triangle's Perimeter: " + getPerimeter();
    }
}
