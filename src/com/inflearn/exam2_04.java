package com.inflearn;

import java.util.Scanner;

public class exam2_04 {
    public static int[] solution(int num){
        int[] answer = new int[num];
        answer[0]=1;
        answer[1]=1;

        for(int i=2; i<num; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        for(int x : solution(num)){
            System.out.print(x+" ");
        }
    }
}
