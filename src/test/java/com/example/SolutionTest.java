package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int[][] dungeon;
    int result;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void dungeonWIthOneRowAndOneColumnAndDontLoseOrGainHealth(){

        result = 1;
        dungeon = new int[][] {{0}};

        assertEquals(result, solution.calculateMinimumHP(dungeon));
    }

    @Test
    public void dungeonWIthOneRowAndOneColumnAndLoseHealth(){

        result = 5;
        dungeon = new int[][] {{-4}};

        assertEquals(result, solution.calculateMinimumHP(dungeon));
    }

    @Test
    public void dungeonWIthThreeRowsAndThreeColumns(){

        result = 7;
        dungeon = new int[][] {{-2,-3,3},{-5,-10,1},{10,30,-5}};

        assertEquals(result, solution.calculateMinimumHP(dungeon));
    }

    @Test
    public void dungeonWIthFiveRowsAndFiveColumns(){

        result = 6;
        dungeon = new int[][] {{-2,-3,3,-4,1},{-5,-10,1,1,-1},{10,30,-5,4,-6}, {-5,2,-4,-1,9}, {-3,-1,-6,4,5}};

        assertEquals(result, solution.calculateMinimumHP(dungeon));
    }

    @Test
    public void dungeonWIthFiveRowsAndFourColumns(){

        result = 3;
        dungeon = new int[][] {{-2,-3,3,-4,1},{10,30,-5,4,-6}, {-5,2,-4,-1,9}, {-3,-1,-6,4,5}};

        assertEquals(result, solution.calculateMinimumHP(dungeon));
    }
}
