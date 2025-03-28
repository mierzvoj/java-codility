package org.example;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int numbersOnTheRight = 0;
        for (int i = 0; i < A.length; i++) {
            numbersOnTheRight += A[i];
        }
        int minDiff = Integer.MAX_VALUE;
        int numbersOnTheLeft = 0;
        for (int i = 0; i < A.length - 1; i++) {
            numbersOnTheRight -= A[i];
            numbersOnTheLeft += A[i];

                if (Math.abs(numbersOnTheLeft - numbersOnTheRight) < minDiff) {
                    minDiff = Math.abs(numbersOnTheLeft - numbersOnTheRight);
            }
        }
        return minDiff;

    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{0, 1000}));
    }
}
