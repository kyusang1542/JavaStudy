package com.inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class exam1_03 {
    public static String solution(String value){
        String answer = "";
        // int로 나타낼 수 있는 최소값을 Integer.MIN_VALUE라고 함
        int m = Integer.MIN_VALUE;
        int pos;

        // 띄어쓰기가 있는 곳의 인덱스 값을 pos에 넣음
        while ((pos=value.indexOf(' '))!=-1){
            String tmp = value.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            value=value.substring(pos+1);
        }
        if(value.length()>m)
            answer=value;
        return answer;

        /*
        String[] s = value.split(" ");
        for(String a : s){
            if(a.length()>m){
                m = a.length();
                answer = a;
            }
        }
        return answer;
         */

        /*
        String saveValue = "";
        String answer = "";
        int count = 0;

        for(char a : value.toCharArray()){
            if(a != 32) {
                saveValue += a;
            }
            else if(a == 32){
                if(count < saveValue.length()){
                    count = saveValue.length();
                    answer = saveValue;
                    saveValue = "";
                }else if(count >= saveValue.length()){
                    saveValue = "";
                }
            }
        }
        if(count < saveValue.length()){
            answer = saveValue;
        }

        return answer;
        */
    }

    public static void main(String[] args) {
        String value = "";
        Scanner kb = new Scanner(System.in);

        value = kb.nextLine();
        System.out.println(solution(value));

        String str = "ABCDE";
        System.out.println(str.substring(1));
        System.out.println(str.substring(1,3));
    }
}
