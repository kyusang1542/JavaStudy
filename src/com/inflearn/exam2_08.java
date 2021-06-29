package com.inflearn;

import java.util.Scanner;

public class exam2_08 {
    public static int[] solution(int num, int[] student){
        int[] answer = new int[num];
        int count = 1;

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(student[i]<student[j])
                    count++;
            }
            answer[i] = count;
            count = 1;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] student = new int[num+1];
        student[num] = Integer.MIN_VALUE;
        for(int i=0; i<num; i++){
            student[i] = kb.nextInt();
        }
        for(int x : solution(num, student)){
            System.out.print(x+" ");
        }
    }
}
