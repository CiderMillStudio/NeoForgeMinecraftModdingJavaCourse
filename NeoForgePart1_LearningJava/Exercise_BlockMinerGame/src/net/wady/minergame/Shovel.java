package net.wady.minergame;

public class Shovel extends Tool {

    public Shovel(int baseDurability) {
        super(baseDurability);

        Dirt dirt = new Dirt();

        this.blockType = dirt.getBlockType();

        this.toolName = "Shovel";
    }
}
