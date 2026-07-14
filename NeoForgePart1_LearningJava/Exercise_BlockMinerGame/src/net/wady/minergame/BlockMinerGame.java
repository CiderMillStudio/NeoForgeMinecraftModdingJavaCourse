package net.wady.minergame;

import java.util.ArrayList;
import java.util.List;

public class BlockMinerGame {

    public final List<Tool> toolList = new ArrayList<>();

    public BlockMinerGame() {
        // constructor for a single game.
    }

    public void startGameLoop() {

        // offer 3 tools to player (can choose any quantity of pickaxe, shovel, or axe)

        // LEVEL LOOP:

        // field player a level (a predetermined supply of blocks (stone, dirt, or wood), and
        // allow player to choose which tool to use to destroy said block
        // depending on tool-block mapping correctness, tool loses some durability, block may drop if correct

        // if player reaches end of level, encounters merchant who trades materials for more tools

        // REPEAT LEVEL LOOP until player runs out of durability of ONE tool.

    }
}
