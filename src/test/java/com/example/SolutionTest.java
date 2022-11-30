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
}
