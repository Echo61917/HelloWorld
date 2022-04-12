package Week6_DataStructures;

import Week3Interfaces.Comparable;

public class Block {

        private int shareCount;
        private double sharePrice;
        private double shareNet;

        public Block(int shareCount, double sharePrice)
        {
            this.shareCount = shareCount;
            this.sharePrice = sharePrice;
        }

        public int getShareCount(){return this.shareCount;}
        public double getSharePrice(){return this.sharePrice;}

        public double calcNetShare()
        {
            return shareNet = this.shareCount * this.sharePrice;
        }

        public double calcNetShare(Block block)
        {
        return shareNet = this.shareCount * this.sharePrice;
        }

        @Override
        public String toString()
        {
            return "Share Count: " + shareCount + "\n" + "Price Per Share: " + sharePrice + "\n"
                    + "Net Price: " + calcNetShare();
        }
}
