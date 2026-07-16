package net.wady.minergame;

import java.util.ArrayList;
import java.util.List;

public class PlayerInventory {
    private List<Tool> playersTools;
    private List<Block> playersBlocks;

    public PlayerInventory() {
        playersTools = new ArrayList<>();
        playersBlocks = new ArrayList<>();
    }

    public void addBlockToInventory(Block block) {
        playersBlocks.add(block);
        System.out.println(block.getBlockType() + " block added to inventory.");
    }

    public void addToolToInventory(Tool tool) {
        playersTools.add(tool);
        System.out.println(tool.toolName + " added to inventory.");
    }

    public void listToolInventory() {
        System.out.println("\nList of Tools Available:");
        for (Tool tool : playersTools) {
            if (tool.isUsable) {
                System.out.println(tool.toolName + " (durability: " + tool.remainingDurability + ")");
            } else {
                System.out.println(tool.toolName + " is broken and useless...");
            }
        }
        System.out.println("---END OF TOOLS LIST---");
    }

    public void listBlocksInventory() {

        int numberOfStone = 0;
        int numberOfWood = 0;
        int numberOfDirt = 0;

        System.out.println("\nList of Blocks Available:");
        for (Block block : playersBlocks) {
            switch (block.getBlockType().toLowerCase()) {
                case "stone":
                    numberOfStone++;
                    break;
                case "wood":
                    numberOfWood++;
                    break;
                case "dirt":
                    numberOfDirt++;
                    break;
            }
        }

        System.out.println("Stone: x" + numberOfStone);
        System.out.println("Wood: x" + numberOfWood);
        System.out.println("Dirt: x" + numberOfDirt);

        System.out.println("---END OF BLOCKS INVENTORY LIST---");

    }


    public Pickaxe getPickaxe() {
        for (Tool tool : playersTools) {
            if (tool.toolName.equalsIgnoreCase("pickaxe")) { return ((Pickaxe) tool); }
        }
        return null;
    }

    public Axe getAxe() {
        for (Tool tool : playersTools) {
            if (tool.toolName.equalsIgnoreCase("axe")) { return ((Axe) tool); }
        }
        return null;
    }

    public Shovel getShovel() {
        for (Tool tool : playersTools) {
            if (tool.toolName.equalsIgnoreCase("shovel")) { return ((Shovel) tool); }
        }
        return null;
    }








}
