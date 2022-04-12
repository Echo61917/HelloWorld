package Week6_DataStructures;

import java.util.Queue;

public class TestBlock {
    public static void main(String[] args)
    {
        Queue<Block> broker = new Queue<>();

        Block block1 = new Block(100, 12);
        Block block2 = new Block(100, 10);

        System.out.println(block1.calcNetShare());
        System.out.println(block2.calcNetShare());



    }
}
