package com.inflearn;

import java.util.Scanner;

public class exam1_02 {
    public static String solution(String a){
        String answer = "";

        for(char change : a.toCharArray()){
            if(Character.isLowerCase(change))
                answer += Character.toUpperCase(change);
            else if (Character.isUpperCase(change))
                answer += Character.toLowerCase(change);
        }
        /*
        for (char change : a.toCharArray()){
            if(change<97)
                change += 32;
            else
                change -= 32;
            answer += change;
        }
         */
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        System.out.println(solution(a));
    }
}
