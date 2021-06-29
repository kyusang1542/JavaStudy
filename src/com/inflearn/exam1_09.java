package com.inflearn;

import java.util.Scanner;

public class exam1_09 {
    public static int solution(String word){
        String answer = "";

        answer = word.replaceAll("[^0-9]","");

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word = kb.next();
        System.out.println(solution(word));
    }
}
