package net.wady.minergame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BlockMinerGame {

    public List<Tool> toolList;
    public PlayerInventory playerInventory;
    public List<MinerLevel> minerLevels;

    private boolean quit = false;

    public BlockMinerGame() {
        toolList = new ArrayList<>();
        playerInventory = new PlayerInventory();
        minerLevels = new ArrayList<>();
    }

    public void generateMinerLevels() {
        MinerLevel minerLevelOne = new MinerLevel(6);
        MinerLevel minerLevelTwo = new MinerLevel(8);

        minerLevels.add(minerLevelOne);
        minerLevels.add(minerLevelTwo);
    }

    public void generateToolsList(Tool... tools) {
        for (Tool tool: tools) {
            toolList.add(tool);
        }

        for (Tool tool : toolList) {
            playerInventory.addToolToInventory(tool);
        }
    }


    public void startGameLoop() {

        generateMinerLevels();

        Pickaxe pickaxe = new Pickaxe(5);
        Axe axe = new Axe(5);
        Shovel shovel = new Shovel(5);
        generateToolsList(pickaxe, axe, shovel);

        System.out.println("\n------------------\n'p' to use pickaxe\n'a' to use axe\n's' to use shovel\n" +
                "'i' to view inventory\n'h' for help\n'q' to quit\n--------------------");

        Random random = new Random();

        int levelCounter = 1;

        for (MinerLevel minerLevel : minerLevels) {
            if (quit) { break; }
            System.out.println("STARTING LEVEL " + levelCounter);

            int numberOfBlocksInLevel = minerLevel.getNumberOfBlocksInLevel();
            int currentBlockNum = 0;

            while (currentBlockNum < numberOfBlocksInLevel && !quit){
                int randomBlockSelector = random.nextInt(0,3);
                switch (randomBlockSelector) {
                    case 0:
                        Stone stoneBlock = new Stone();
                        stoneBlock.introduceBlock();
                        chooseBlockAction(stoneBlock);
                        break;
                    case 1:
                        Wood woodBlock = new Wood();
                        woodBlock.introduceBlock();
                        chooseBlockAction(woodBlock);
                        break;
                    case 2:
                        Dirt dirtBlock = new Dirt();
                        dirtBlock.introduceBlock();
                        chooseBlockAction(dirtBlock);
                        break;
                    default:
                        System.out.println("ERROR, shouldn't be defaulting on this switch");
                        break;

                }

                currentBlockNum++;
            }

            if (!quit) {
                System.out.println("END OF LEVEL " + levelCounter);
                levelCounter++;
            }


        }

        System.out.println("END OF GAME :)");
        playerInventory.listBlocksInventory();
        playerInventory.listToolInventory();

        // LEVEL LOOP:

        // field player a level (a predetermined supply of blocks (stone, dirt, or wood), and
        // allow player to choose which tool to use to destroy said block
        // depending on tool-block mapping correctness, tool loses some durability, block may drop if correct

        // if player reaches end of level, encounters merchant who trades materials for more tools

        // REPEAT LEVEL LOOP until player runs out of durability of ONE tool.

    }


    public void chooseBlockAction(Block block) {
        Scanner reader = new Scanner(System.in);

        String choice = reader.nextLine().toLowerCase();

        switch (choice) {
            case "i", "inventory":
                playerInventory.listToolInventory();
                playerInventory.listBlocksInventory();
                chooseBlockAction(block);
                break;
            case "p", "pickaxe", "mine":
                playerInventory.getPickaxe().useTool(block, playerInventory);
                break;
            case "a", "axe", "chop":
                playerInventory.getAxe().useTool(block, playerInventory);
                break;
            case "s", "shovel", "dig":
                playerInventory.getShovel().useTool(block, playerInventory);
            case "h", "help":
                System.out.println("\n------------------\n'p' to use pickaxe\n'a' to use axe\n's' to use shovel\n" +
                        "'i' to view inventory\n'h' for help\n'q' to quit\n--------------------");
                break;
            case "q", "quit":
                quit = true;
                break;

        }


    }
}
