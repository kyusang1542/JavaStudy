package com.inflearn;

import java.util.Scanner;

public class exam2_03 {
    public static String[] solution(int num, int[] A, int[] B){
        String[] answer = new String[num];

        for(int i=0; i<num; i++){
            if(A[i] == B[i]){
                answer[i] = "D";
            }else if((A[i]==1 && B[i]==3) || (A[i]==2 && B[i]==1) || (A[i]==3 && B[i]==2)){
                answer[i] = "A";
            }else{
                answer[i] = "B";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        int[] A = new int[num];
        for(int i=0; i<num; i++){
            A[i] = kb.nextInt();
        }

        int[] B = new int[num];
        for(int i=0; i<num; i++){
            B[i] = kb.nextInt();
        }

        for(String x : solution(num, A, B)){
            System.out.println(x);
        }
    }
}
