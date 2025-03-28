package org.example;

public class BinaryGap {
    public int solution(int N){
        int counter = 0;
        int maxCount = 0;
        boolean started = false;
        String bStr = Integer.toString(N, 2);
        System.out.println(bStr);
        for(int i = 0; i < bStr.length(); i++ ){
            String c = bStr.substring(i, i+1);
//            System.out.println(c);
            if(c.equals("1")){
                if(started){
                    if(counter > maxCount){
                        maxCount = counter;
                    }
                }
                counter = 0;
                started = true;
            }
            if(c.equals("0")){
                counter++;
            }
        }
        System.out.println(maxCount);
        return maxCount;
    };
    public static void main(String[] args) {

        BinaryGap main = new BinaryGap();
        main.solution(529);

    }
}