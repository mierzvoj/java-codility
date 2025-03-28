package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        int[] counters = new int[N];
        int maxValue = 0;
        int baseValue = 0;

        for (int i = 0; i < A.length; i++) {
            list.add(A[i]);

            if (list.get(i) <= N && list.get(i) >= 1) {
                counters[A[i] - 1]++;
                int[] sortedArray = Arrays.copyOf(counters, counters.length);
                Arrays.sort(sortedArray);
                maxValue = sortedArray[sortedArray.length - 1];
            }

            if (list.get(i) == N + 1) {
                for (int j = 0; j < counters.length; j++) {
                    counters[j] = maxValue;
                }
            }
        }
        return counters;
    }

    public static void main(String[] args) {
        MaxCounters mc = new MaxCounters();
        var sol = mc.solution(5, new int[] { 3, 4, 4, 1, 4, 4, 6 });
        for (int i : sol) {
            System.out.println(i);
        }
    }
}
