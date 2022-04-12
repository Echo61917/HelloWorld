package Week6_DataStructures;

import java.awt.desktop.QuitEvent;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TestBlock {
    public static void main(String[] args) {
        //prompt user for transaction
        //create a new Block
        //add Block to queue
        //if user sells I need to peek into queue
        //display profit to user

        Queue<Block> broker = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        Block buyBlock = null;
        Block sellBlock = null;
        String response = " ";


        //String[] cases = response.split(" ");



        while (!response.equals("Quit")) {
            System.out.println("Enter a transaction: ");
            response = scan.nextLine();

            if (response.equals("Buy")) {
                System.out.println("Please enter share quantity: ");
                int shareQuant = scan.nextInt();

                System.out.println("Please enter share price:");
                double sharePrice = scan.nextDouble();
                scan.nextLine();

                buyBlock = new Block(shareQuant, sharePrice);
                broker.offer(buyBlock);

            } else if (response.equals("Sell")) {
                System.out.println("Please enter share quantity: ");
                int shareQuant = scan.nextInt();

                System.out.println("Please enter share price:");
                double sharePrice = scan.nextDouble();
                scan.nextLine();

                sellBlock = new Block(shareQuant, sharePrice);
                int remainingShares = sellBlock.getShareCount();
                double tempGain = 0;

                while(remainingShares != 0 && remainingShares > 0) {
                    Block processBlock = broker.remove();
                    remainingShares = sellBlock.getShareCount() - processBlock.getShareCount();

                    double top = processBlock.getShareCount() * sellBlock.getSharePrice(); //This equals total profit from first block
                    double bot = processBlock.calcNetShare();
                    tempGain = tempGain + top - bot;

                }
                System.out.println(tempGain);
            }
        }


//        Block block1 = new Block(100, 12);
//        Block block2 = new Block(100, 10);
//
//        System.out.println(block1.calcNetShare());
//        System.out.println(block2.calcNetShare());
        //System.out.println(buyBlock);
//        for(Block b : broker)
//        {
//            System.out.println(b);
//        }


    }

}
