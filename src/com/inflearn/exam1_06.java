package com.inflearn;

import java.util.*;

public class exam1_06 {
    public static String solution(String word){
        String answer = "";

        for(int i=0; i<word.length(); i++){
            // indexOf 는 제일 처음 발견된 문자의 번호를 리턴함
            System.out.println(word.charAt(i)+" "+i+" "+word.indexOf(word.charAt(i)));
            if(word.indexOf(word.charAt(i))==i)
                answer+=word.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
