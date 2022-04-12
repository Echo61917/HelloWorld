package Week6_DataStructures;

import Week3Interfaces.Comparable;

public class Block {

        private int shareCount, sharePrice;
        private int shareNet;

        public Block(int shareCount, int sharePrice)
        {
            this.shareCount = shareCount;
            this.sharePrice = sharePrice;
        }

        public int getShareCount(){return this.shareCount;}
        public int getSharePrice(){return this.sharePrice;}

        public int calcNetShare()
        {
            return shareNet = this.shareCount * this.sharePrice;
        }

        public int calcNetShare(Block block)
        {
        return shareNet = this.shareCount * this.sharePrice;
        }

        @Override
        public String toString()
        {
            return "Share Count: " + shareCount + "/n" + "Price Per Share: " + sharePrice + "/n"
                    + "Net Price: " + calcNetShare();
        }
}
