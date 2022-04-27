package Week6_DataStructures;

import java.util.*;

public class QueueExercise1 {
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

        while (!response.equalsIgnoreCase("Quit")) {
            System.out.println("Enter a transaction: ");
            response = scan.nextLine();

            if (response.equalsIgnoreCase("Buy")) {
                System.out.println("Please enter share quantity: ");
                int shareQuant = scan.nextInt();

                System.out.println("Please enter share price:");
                double sharePrice = scan.nextDouble();
                scan.nextLine();

                buyBlock = new Block(shareQuant, sharePrice);
                broker.offer(buyBlock);

            } else if (response.equalsIgnoreCase("Sell")) {
                System.out.println("Please enter share quantity: ");
                int shareQuant = scan.nextInt();

                System.out.println("Please enter share price:");
                double sharePrice = scan.nextDouble();
                scan.nextLine();

                sellBlock = new Block(shareQuant, sharePrice);
                int remainingShares = sellBlock.getShareCount();
                double tempGain = 0;

                while (remainingShares > 0) {
                    if (remainingShares <= 0) {
                        break;
                    }
                    Block processBlock = broker.remove();
                    if (remainingShares > processBlock.getShareCount()) {
                        double top = processBlock.getShareCount() * sellBlock.getSharePrice(); //This equals total profit from first block
                        double bot = processBlock.calcNetShare();
                        tempGain = tempGain + top - bot;

                        remainingShares = remainingShares - processBlock.getShareCount();
                    } else if (remainingShares < processBlock.getShareCount()) {
                        double top2 = remainingShares * sellBlock.getSharePrice();
                        double bot2 = remainingShares * processBlock.getSharePrice();
                        tempGain = tempGain + top2 - bot2;

                        remainingShares = remainingShares - processBlock.getShareCount();
                    }


                }
                System.out.println(tempGain);
            }
        }


    }
}