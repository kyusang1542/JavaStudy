package com.inflearn;

import java.util.Scanner;

public class exam1_07 {
    public static String soultion(String word){

        String answer = "NO";
        String tmp = new StringBuilder(word).reverse().toString();
        // equalsIgnoreCase는 대소문자를 무시하고 String이 같은지 확인
        if(word.equalsIgnoreCase(tmp))
            answer = "YES";
        return answer;

        //        String answer = "";
//        word = word.toLowerCase();
//
//        char[] charWord = word.toCharArray();
//        int lt=0, rt=charWord.length-1;
//
//        while (lt<rt){
//            if(charWord[lt]==charWord[rt]){
//                lt++;
//                rt--;
//            }else{
//                return answer="NO";
//            }
//        }
//
//        return answer="YES";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(soultion(word));
    }
}
