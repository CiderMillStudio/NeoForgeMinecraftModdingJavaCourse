package net.wady.minergame;

public class Pickaxe extends Tool {

    public Pickaxe(int baseDurability) {
        super(baseDurability);

        Stone stone = new Stone();

        this.blockType = stone.getBlockType();

        this.toolName = "Pickaxe";
    }


}
