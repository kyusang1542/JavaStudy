package com.inflearn;

import java.util.Scanner;

public class exam1_11 {
    public static String solution(String word){
        String answer = "";
        int count = 1;
        word = word + " ";

        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i)==word.charAt(i+1))
                count++;
            else {
                answer += word.charAt(i);
                if(count > 1)
                    answer += String.valueOf(count);
                count=1;
            }
        }

        /*
        for(int i=0; i<word.length(); i++){
            if(i==word.length()-1 || word.charAt(i)!=word.charAt(i+1)) {
                if (count == 1) {
                    answer += word.charAt(i);
                } else {
                    answer += word.charAt(i);
                    answer += count;
                    count = 1;
                }
            }else if(word.charAt(i)==word.charAt(i+1)) {
                count++;
            }
        }
         */

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
