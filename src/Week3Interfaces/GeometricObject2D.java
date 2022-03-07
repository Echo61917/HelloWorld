package Week3Interfaces;

public abstract class GeometricObject2D implements Comparable {
    //data fields (instance and static variables)
    protected String color = "white";
    protected boolean filled;
    protected java.util.Date dateCreated;

    //zero-argument constructor
    protected GeometricObject2D(){
        dateCreated = new java.util.Date();
    }

    //multiple-argument constructor
    protected GeometricObject2D( String color, boolean filled ){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //getter methods
    public String getColor(){ return this.color; }
    public boolean isFilled(){ return this.filled; }
    public java.util.Date getDateCreated(){ return dateCreated; }

    //setter methods
    public void setColor( String color ){ this.color = color; }
    public void setFilled( boolean filled ){ this.filled = filled; }

    //Implements Comparable
    @Override
    public boolean max(GeometricObject2D other)
    {

        if(other.getArea() < getArea())
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    //toString
    @Override
    public String toString(){
        return "created on " + dateCreated + "\ncolor; " + color +
                " and filled: " + filled;
    }

    //abstracted methods (to be implemented by subclass)
    public abstract double getArea();
    public abstract double getPerimeter();
}
