package net.wady.minergame;

public class Wood extends Block {

    private String blockType = "wood";

    @Override
    public String getBlockType() {
        return blockType;
    }

    @Override
    public void harvestBlock(PlayerInventory inventory) {
        inventory.addBlockToInventory(this);
    }

    @Override
    protected void introduceBlock() {
        super.introduceBlock();
    }
}
