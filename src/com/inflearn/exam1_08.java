package com.inflearn;

import java.util.Scanner;

public class exam1_08 {
    public static String solution(String words){
        String answer = "NO";
        words = words.toLowerCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(words).reverse().toString();
        if(words.equals(tmp))
            answer = "YES";

        return answer;

        //        String answer = "";
//        StringBuilder realWord = new StringBuilder();
//
//        char[] charWords = words.toCharArray();
//
//        for(int i=0; i<charWords.length; i++){
//            if(Character.isAlphabetic(charWords[i]))
//                realWord.append(charWords[i]);
//        }
//
//        String reversWord = new StringBuilder(realWord).reverse().toString();
//        // StringBuiler를 String으로 변환해 줄때는 toStirng을 사용
//        String realword2 = realWord.toString();
//        if(realword2.equalsIgnoreCase(reversWord))
//            answer = "YES";
//        else
//            answer = "NO";
//
//        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String words = kb.nextLine();
        System.out.println(solution(words));
    }
}
