package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OddOccurencesInArray {
    HashSet<Integer> aList = new HashSet<Integer>();
    public int solution(int[] A) {
        for(int i = 0; i < A.length; i++){
            int a = A[i];
            if(aList.contains(a)){
                aList.remove(new Integer(a));
            } else {
                aList.add(a);
            }
        }
        return aList.iterator().next();
    }


    public static void main(String[] args) {
        OddOccurencesInArray odd = new OddOccurencesInArray();
        int res = odd.solution(new int[]{3,3,1,0,1,2,0});
        System.out.println(res);

    }
}
