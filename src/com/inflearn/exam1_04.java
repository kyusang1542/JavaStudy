package com.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class exam1_04 {
    public static ArrayList<String> solution(String[] word){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : word){
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while (lt<rt){
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        /*
        for(String x : word){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
         */

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String[] word = new String[num];
        for(int i=0; i<num; i++)
            word[i] = kb.next();
        for(String x : solution(word)){
            System.out.println(x);
        }
    }
}
