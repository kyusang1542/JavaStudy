package com.inflearn;

import java.util.Scanner;

public class exam1_10 {
    public static int[] solution(String word, char c){
        int[] answer=new int[word.length()];
        int p=1000;
        // 왼쪽에 있는 c로 부터의 거리를 계산
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==c){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        // 오른쪽에 있는 c로 부터의 거리를 계산
        for(int i=word.length()-1; i>=0; i--){
            if(word.charAt(i)==c) p=0;
            else{
                p++;
                // 왼쪽과 오른쪽중 가까운 거리에 있는 값을 넣음
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        char c = kb.next().charAt(0);
        for(int x : solution(word, c)){
            System.out.print(x+" ");
        }
    }
}
