package com.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class exam2_01 {
    public static ArrayList<Integer> solution(int[] array){
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i< array.length; i++){
            if(i==0){
                answer.add(array[i]);
            }else if(array[i-1]<array[i]){
                answer.add(array[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] array = new int[num];
        for(int i=0; i<num; i++){
            array[i] = kb.nextInt();
        }
        for(int x : solution(array)){
            System.out.print(x+" ");
        }
    }
}
