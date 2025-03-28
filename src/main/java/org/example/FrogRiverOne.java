package org.example;

import java.util.*;

public class FrogRiverOne {

public int solution(int X, int[] A) {
    // Set to track which positions are covered
    boolean[] covered = new boolean[X + 1];
    int positionsCovered = 0;

    // Process each falling leaf
    for (int i = 0; i < A.length; i++) {
        int position = A[i];

        // If this position wasn't covered before
        if (!covered[position]) {
            covered[position] = true;
            positionsCovered++;

            // Check if all positions are now covered
            if (positionsCovered == X) {
                return i; // Return the current time
            }
        }
    }

    // If we reach here, the frog can't cross
    return -1;
}

        public static void main (String[] args){
            System.out.println(new FrogRiverOne().solution(5, new int[]{0, 3, 1, 4, 2, 3, 5, 4, 100}));
        }
    }
