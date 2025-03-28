package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCountersSecond {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;  // Current maximum value
        int lastUpdate = 0;  // Last "max counter" operation value

        for (int operation : A) {
            if (operation == N + 1) {
                // "Max counter" operation - don't update all counters yet
                lastUpdate = maxCounter;
            } else if (operation >= 1 && operation <= N) {
                // Get the counter index (0-based)
                int index = operation - 1;

                // Lazy update: ensure counter is at least at lastUpdate value
                counters[index] = Math.max(counters[index], lastUpdate);

                // Increment the counter
                counters[index]++;

                // Track the new maximum value
                maxCounter = Math.max(maxCounter, counters[index]);
            }
        }

        // Final pass to ensure all counters are at least at lastUpdate
        for (int i = 0; i < N; i++) {
            counters[i] = Math.max(counters[i], lastUpdate);
        }

        return counters;
    }

    public static void main(String[] args) {
        MaxCountersSecond mc = new MaxCountersSecond();
        var sol = mc.solution(5, new int[]{1, 3, 3, 4, 6, 5});
        for (int i : sol) {
            System.out.print(i + " ");
        }
    }
}
