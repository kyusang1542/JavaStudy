package com.inflearn;

import java.util.Scanner;

public class exam2_02 {
    public static int solution(int[] students){
        int answer = 1;
        int max = students[0];

        for(int i=1; i<students.length; i++){
            if(max<students[i]){
                max = students[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[] students = new int[num];
        for(int i=0; i<num; i++){
            students[i] = kb.nextInt();
        }
        System.out.println(solution(students));
    }
}
