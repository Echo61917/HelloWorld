package Week5_Generics;

public class Car implements Comparable<Car>
{
    private String make, model;
    private int year;

    public Car( String make, String model, int year ){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){ return this.make; }
    public String getModel(){ return this.model; }
    public int getYear(){ return this.year; }

    @Override
    public int compareTo( Car c ){
        return this.year - c.getYear();
    }

    @Override
    public String toString(){
        return "Make: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year;
    }
}
