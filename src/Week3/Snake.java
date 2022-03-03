package Week3;

import java.util.ArrayList;

public class Snake
{
    //fields
    private int size;
    private ArrayList<Block> body = new ArrayList<Block>();
    private Block head;

    //constructor
    public Snake(int startX, int startY, int size)
    {
        this.size = size;
        head = new Block(startX, startY);
        body.add(0, head);
    }
    //getter
    public ArrayList<Block> getBody(){return body;}
    //update
    public void update(String dir)
    {
        int len = body.size();
        ate(dir);
        body.remove(len);


        //  if(dir.equals("RIGHT"))
//       {
//         newX = head.getX() + this.size;
//       }
//       if(dir.equals("LEFT"))
//       {
//         newX = head.getX() - this.size;
//       }
//       if(dir.equals("UP"))
//       {
//         newY = head.getY() - this.size;
//       }
//       if(dir.equals("DOWN"))
//       {
//         newY = head.getY() + this.size;
//       }
    }

    public void ate(String dir)
    {
        int newX = head.getX();
        int newY = head.getY();

        switch(dir)
        {
            case "RIGHT":
                newX = head.getX() + this.size;
                break;
            case "LEFT":
                newX = head.getX() - this.size;
                break;
            case "UP":
                newY = head.getY() - this.size;
                break;
            case "DOWN":
                newY = head.getY() + this.size;
                break;
        }

        head = new Block(newX, newY);
        body.add(0,head);
    }

}