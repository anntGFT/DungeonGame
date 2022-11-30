package org.example;

import java.util.Arrays;

public class Solution {
    public Solution(){

    }

    public int calculateMinimumHP(int[][] dungeon) {

        int m = dungeon.length, n = dungeon[0].length;
        int[][] next = new int[m+1][n+1];

        for(int i=0; i<=m; i++){

            Arrays.fill(next[i], Integer.MAX_VALUE);
        }

        next[m-1][n] = 1;
        next[m][n-1] = 1;

        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){

                int minH = Math.min(next[i][j+1], next[i+1][j]) - dungeon[i][j];

                if(minH < 1){

                    minH = 1;
                }

                next[i][j] = minH;
            }
        }

        return next[0][0];
    }
}