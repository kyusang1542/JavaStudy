package com.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class exam2_05 {
    public static int solution(int num){
        int answer = 0;
        // 인덱스 번호가 0부터 시작임으로 +1을하여 숫자를 맞춰줌
        // (num이 20이라면 인덱스 번호가 0이부터이므로 19까지의 배열이 만들어
        // 지고 그러면 19번쨰까지의 자연수만 비교가 됨으로 +1을하여
        // 20번까지의 배열을 넣을 수 있게 +1을 해줌)
        int[] ch = new int[num+1];
        for(int i=2; i<=num; i++){
            // ch[i]==0인 것은 소수임을 의미
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=num; j=j+i)
                    ch[j]=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(solution(num));
    }
}
