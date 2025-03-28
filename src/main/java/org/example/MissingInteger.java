package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingInteger {

    public int solution(int[] A){
        List<Integer> hs = new ArrayList<Integer>();
        for(int i = 1; i <=A.length + 1; i++){
            hs.add(i);
        }

        for(int a : A){
            hs.remove(new Integer(a));
        }

        return hs.iterator().next();

    }

    public static void main(String[] args){
        MissingInteger mi = new MissingInteger();
        var sol = mi.solution(new int[]{1, 3, 6, 4, 1, 2});
        System.out.println(sol);
    }

}
