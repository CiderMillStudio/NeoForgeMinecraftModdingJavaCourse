package net.wady.minergame;

public abstract class Block {

    public abstract String getBlockType();

    public abstract void harvestBlock(PlayerInventory inventory);

    protected void introduceBlock() {
        System.out.println("You've come across a " + this.getBlockType() + " block.");
    }


}
