package com.study;

import java.util.Arrays;
import java.util.Collections;

public class test4 {

    public static int solution(int[] citations){

        int count = 0;

        Integer[] arraySort = Arrays.stream(citations).boxed().toArray(Integer[]::new);

        Arrays.sort(arraySort, Collections.reverseOrder());

        for(int i=0; i<arraySort.length; i++){
            if(arraySort[i] < i+1){
                return i;
            }else if(arraySort[i] == i+1){
                return i+1;
            }else if(arraySort[0] == 0){
                return 0;
            }else
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
         int[] citations = {3,0,6,1,5};
        // int[] citations = {1,7,0,1,6,4};
        //int[] citations = {0};
        System.out.println(solution(citations));
    }
}
