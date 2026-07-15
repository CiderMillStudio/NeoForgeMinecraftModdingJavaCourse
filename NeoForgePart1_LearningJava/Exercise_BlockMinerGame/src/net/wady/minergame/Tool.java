package net.wady.minergame;

public abstract class Tool {
    private final int baseDurability;
    protected int remainingDurability;
    protected String blockType;
    protected boolean isUsable = true;
    protected String toolName;


    public Tool(int baseDurability) {
        this.baseDurability = baseDurability;
        remainingDurability = baseDurability;
    }

    public void useTool(Block block) {
        if (this.isUsable) {
            if (block.getBlockType().equalsIgnoreCase(this.blockType)) { // if this is the correct block type for this tool:
                degradeTool(1);
            }
            else { // if this is the INCORRECT block type for this tool:
                degradeTool(10);
            }
        }
        else {
            System.out.println(this.toolName + " is broken, cannot use it!");
        }


    }

    public void destroyTool(){
        this.isUsable = false;
    }

    public void degradeTool(int degradeAmount) {
        if (this.remainingDurability >= degradeAmount) {
            this.remainingDurability -= degradeAmount;
        }
        else {
            destroyTool();
        }
    }

}
