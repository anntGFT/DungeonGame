package org.example;

import java.util.Arrays;

public class Solution {
    public Solution(){

    }

    public int calculateMinimumHP(int[][] dungeon) {

        Integer[][] aux = new Integer[dungeon.length][dungeon[0].length];

        return calculate(dungeon, 0, 0, aux);
    }

    private int calculate(int[][] a, int m, int n, Integer[][] aux) {

        if (m == a.length - 1 && n == a[0].length - 1)

            if (a[m][n] > 0){

                return 1;
            }else{

                return -a[m][n] + 1;
            }

        if (aux[m][n] != null){

            return aux[m][n];
        }

        if (m == a.length - 1){

            return aux[m][n] = Math.max(1, calculate(a, m, n + 1, aux) - a[m][n]);
        }

        if (n == a[0].length - 1){

            return aux[m][n] = Math.max(1, calculate(a, m + 1, n, aux) - a[m][n]);
        }


        return aux[m][n] = Math.max(1, Math.min(calculate(a, m + 1, n, aux) - a[m][n],
                calculate(a, m, n + 1, aux) - a[m][n]));
    }
}