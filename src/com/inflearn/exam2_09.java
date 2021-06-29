package com.inflearn;

import java.util.Scanner;

public class exam2_09 {
    public static int solution(int num, int[][] pan){
        int answer = 0;

        int tmp = 0;
        int tmp2 = 0;

        // 가로,세로 길이중 가장 큰 값을 구함
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                tmp += pan[i][j];
                tmp2 += pan[j][i];
            }
            answer = Math.max(answer, tmp);
            answer = Math.max(answer, tmp2);
            tmp = 0;
            tmp2 = 0;
        }

        // 대각선 길이중 가장 큰 값을 구함
        int lowNum = num-1;
        for(int i=0; i<num; i++){
            tmp += pan[i][i];
            tmp2 += pan[i][lowNum];
            lowNum--;
        }
        if(answer<tmp)
            answer = tmp;
        if(answer<tmp2)
            answer = tmp2;

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] pan = new int[num][num];
        for (int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                pan[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(num, pan));
    }
}
