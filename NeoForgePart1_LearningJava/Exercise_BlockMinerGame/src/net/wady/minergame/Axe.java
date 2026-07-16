package net.wady.minergame;

public class Axe extends Tool {
    public Axe(int baseDurability) {
        super(baseDurability);

        Wood wood = new Wood();

        this.blockType = wood.getBlockType();

        this.toolName = "Axe";
    }
}
