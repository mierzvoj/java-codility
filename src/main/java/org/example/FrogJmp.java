package org.example;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int n = 1;
        int dist = Y - X;
        int jumps = (int) Math.ceil((double) dist / D);

        return jumps;
    }


    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(85, 85, 30));
    }


}