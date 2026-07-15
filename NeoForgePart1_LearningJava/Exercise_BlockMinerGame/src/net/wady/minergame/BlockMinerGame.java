package net.wady.minergame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlockMinerGame {

    public List<Tool> toolList;
    public PlayerInventory playerInventory;
    public List<MinerLevel> minerLevels;

    public BlockMinerGame(List<Tool> toolList, PlayerInventory playerInventory, List<MinerLevel> minerLevels) {
        this.toolList = toolList;
        this.playerInventory = playerInventory;
        this.minerLevels = minerLevels;
    }


    public void startGameLoop() {

        System.out.println("\n------------------\n'p' to use pickaxe\n'a' to use axe\n's' to use shovel\n--------------------");

        Random random = new Random();

        for (MinerLevel minerLevel : minerLevels) {

            int numberOfBlocksInLevel = minerLevel.getNumberOfBlocksInLevel();
            int currentBlock = 0;

            while (currentBlock < numberOfBlocksInLevel){
                int randomBlockSelector = random.nextInt(0,3);
                switch (randomBlockSelector) {
                    case 0:

                }


            }

        }



        // offer 3 tools to player (can choose any quantity of pickaxe, shovel, or axe)

        // LEVEL LOOP:

        // field player a level (a predetermined supply of blocks (stone, dirt, or wood), and
        // allow player to choose which tool to use to destroy said block
        // depending on tool-block mapping correctness, tool loses some durability, block may drop if correct

        // if player reaches end of level, encounters merchant who trades materials for more tools

        // REPEAT LEVEL LOOP until player runs out of durability of ONE tool.

    }
}
