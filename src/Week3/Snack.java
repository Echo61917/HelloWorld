package Week3;

public class Snack
{
    private Block snack;
    private int width, height, size;

    public Snack(int w, int h, int size)
    {
        this.width = w;
        this.height = h;
        this.size = size;

        int randX = (int)(w/size*Math.random())*size;
        int randY = (int)(h/size*Math.random())*size;
        snack = new Block(randX, randY);
    }
    public Block getSnack(){return this.snack;}
}