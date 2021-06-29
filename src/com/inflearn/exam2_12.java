package com.inflearn;

import java.util.Scanner;

public class exam2_12 {
    public static int solution(int num1, int num2, int[][] student){
        int answer = 0;

        // i와 j는 학생을 즉, i학생, j학생과 같이 각각 비교군을 가르킴(열) (i,j)
        for(int i=1; i<=num1; i++){
            for(int j=1; j<=num1; j++){
                int cnt=0;
                // k는 비교할 횟수를 가르킴(행)
                for(int k=0; k<num2; k++){
                    int pi=0, pj=0;
                    // s는 탐색군을 의미함 여기서는 num1명 까지의 인원수가 있음으로
                    // num1이 4라고 가정할 때 0등부터 3등까지가 존재함
                    for(int s=0; s<num1; s++){
                        // i번 학생의 등수를 나타냄
                        if(student[k][s]==i)
                            pi=s;
                        // j번 학생의 등수를 나타냄
                        if(student[k][s]==j)
                            pj=s;
                    }
                    if(pi<pj)
                        cnt++;
                }
                if(cnt==num2)
                    answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[][] student = new int[num2][num1];
        for(int i=0; i<num2; i++){
            for(int j=0; j<num1; j++){
                student[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(num1, num2, student));
    }
}
