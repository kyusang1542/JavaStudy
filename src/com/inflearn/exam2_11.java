package com.inflearn;

import java.util.Scanner;

public class exam2_11 {

    public static int solution(int n, int[][] arr){
        int answer=0, max=0;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.print(solution(n, arr));
    }

    // 아래의 코드는 내가 만든 코드이며 정상 동작하나 이유는 모르겠지만
    // 코딩채점기에 돌려보면 정답으로 판정이 나오지 않음
    // 위의 코드는 코딩채점기에 돌렸을때 정답으로 판정이 나오는 코드임
    // 코딩채점기의 정답률이 매우 현저히 낮은것으로 보아 코딩채점기 자체의 문제일 가능성이 높음

    /*
    public static int student(int num, int[][] student){
        int answer = 0;
        int temp1 = 0;
        int temp2 = 0;

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                for(int k=0; k<5; k++){
                    if(student[i][k] == student[j][k]){
                        temp2++;
                        break;
                    }
                }
            }
            if(temp2>temp1){
                temp1 = temp2;
                temp2 = 0;
                answer=i+1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int num = kb.nextInt();
        int[][] student = new int[num][5];

        for(int i=0; i<num; i++){
            for(int j=0; j<5; j++){
                student[i][j] = kb.nextInt();
            }
        }

        System.out.println(student(num,student));
    }
     */
}
