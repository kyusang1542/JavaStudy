package com.inflearn;

import java.util.Scanner;

public class exam1_05 {
    public static String solution(String word){
        String answer = "";

        char[] charWord = word.toCharArray();

        int lt = 0;
        int rt = charWord.length-1;

        char c = 'a';

        while (lt<rt){
            if((charWord[lt]>=65 && charWord[lt]<=90) || (charWord[lt]>=97 && charWord[lt]<=122)){
                char tmp = charWord[lt];
                charWord[lt] = charWord[rt];
                charWord[rt] = tmp;
            }
            lt++;
            rt--;
        }

        answer = String.valueOf(charWord);

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
