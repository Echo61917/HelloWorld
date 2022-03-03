package Week3;

//All this class does is getting the X, Y values and is setting them
public class Block
{
    private int x, y;

    public Block(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX(){ return this.x;}
    public int getY(){ return this.y;}

    public void setX(int x) { this.x = x;}
    public void setY(int y) { this.y = y;}


}