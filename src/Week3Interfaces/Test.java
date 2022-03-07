package Week3Interfaces;

public class Test {
    public static void main(String[] args)
    {
        Circle circle = new Circle("Red", true, 10);
        Rectangle rectangle = new Rectangle("Blue", false, 10, 20);
        Triangle triangle = new Triangle("Green", true, 10, 30, true);

        GeometricObject2D[] arrShapes = {circle, rectangle, triangle};
        double[] areaValues = new double[3];
        double[] perimeterValues = new double[3];

        for(GeometricObject2D shape : arrShapes)
        {
            int x = 0;
            areaValues[x] = shape.getArea();
            perimeterValues[x] = shape.getPerimeter();
            System.out.println(areaValues[x] + ", " + perimeterValues[x]);
            x++;

        }

        System.out.println(circle.max(rectangle));
        System.out.println(rectangle.max(triangle));
        System.out.println(circle.max(triangle));
    }
}
