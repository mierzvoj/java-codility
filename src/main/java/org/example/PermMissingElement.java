package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PermMissingElement {

    public int solution(int[] A){
        List<Integer> list = new ArrayList<Integer>();

        int sumArr = 0;
        for(int i = 0; i < A.length; i++){
            list.add((int)A[i]);
            sumArr += A[i];
        }

        Collections.sort(list);
        int gauss = (list.size()) * (list.get(0) + list.get(list.size()-1)) / 2 ;

        return gauss - sumArr;

    }

    public static void main(String[] args){
        System.out.println(new PermMissingElement().solution(new int[]{1}));
    }
}
