package com.inflearn;

import java.util.Scanner;

public class exam1_12 {
    public static String solution(int num, String password){
        String answer = "";
        for(int i=0; i<num; i++){
            String tmp = password.substring(0, 7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(tmp, 2);
            answer+=(char)n;
            password = password.substring(7);
        }
        return answer;

//        String answer = "";
//        StringBuilder pass = new StringBuilder();
//        int change = 0;
//
//        // 암호를 이진수로 변환.
//        for(int i=0; i<password.length(); i++){
//            if(password.charAt(i)=='#')
//                pass.append("1");
//            else
//                pass.append("0");
//        }
//
//        int oneCount = 0;
//        int twoConut = 1;
//        for(int i=0; i<num; i++){
//            change = Integer.parseInt(pass.substring(oneCount, 7*twoConut), 2);
//            char a = (char)change;
//            answer += a;
//            oneCount += 7;
//            twoConut++;
//        }
//
//        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String password = kb.next();
        System.out.println(solution(num, password));
    }
}
