package net.wady.minergame;

public abstract class Block {

    public abstract String getBlockType();
    public abstract void destroyBlock();

    public void presentBlock() {
        System.out.println("You've come across a " + this.getBlockType() + " block.");
    }


}
