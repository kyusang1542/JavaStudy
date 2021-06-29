package com.inflearn;

import java.util.Scanner;

public class exam2_10 {

    public static int solution(int num, int[][] san){
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // 출력용 임시 코드
//        System.out.println();
//        for(int i=0; i<num+2; i++){
//            for(int j=0; j<num+2; j++){
//                System.out.print(san[i][j]+" ");
//            }
//            System.out.println();
//        }

//        for(int i=1; i<num+1; i++){
//            for(int j=1; j<num+1; j++){
////                System.out.print(san[i][j]+" ");
//                if(san[i][j]>san[i-1][j] && san[i][j]>san[i+1][j] && san[i][j]>san[i][j-1] && san[i][j]>san[i][j+1])
//                    answer++;
//            }
////            System.out.println();
//        }

        for(int i=1; i<num+1; i++){
            for(int j=1; j<num+1; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(san[nx][ny]>=san[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int[][] san = new int[num+2][num+2];
        for(int i=1; i<num+1; i++){
            for(int j=1; j<num+1; j++){
                san[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(num, san));
    }
}
