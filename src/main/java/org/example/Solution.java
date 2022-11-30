package org.example;

public class Solution {
    public Solution(){

    }

    public int calculateMinimumHP(int[][] dungeon) {

        int minimumHealth = 1;

        minimumHealth += Math.abs(dungeon[0][0]);

            return minimumHealth;
    }
}