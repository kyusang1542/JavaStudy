package com.inflearn;

import java.util.Scanner;

public class exam2_07 {
    public static int solution(int num, int[] exam){
        int answer = 0;
        int count = 1;

        for(int i=0; i<num; i++){
            if(exam[i]==1){
                answer += count;
                count++;
            }else
                count = 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] exam = new int[num];
        for(int i=0; i<num; i++){
            exam[i] = kb.nextInt();
        }
        System.out.println(solution(num, exam));
    }
}
