package com.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam5_07 {
    public static String solution(String str1, String str2){
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for(char x : str1.toCharArray())
            queue.offer(x);

        for(char x : str2.toCharArray()){
            // queue에 해당 과목이 있는지 확인
            // queue에는 해당 과목을 들어야하는 순서가 순서대로 들어있음
            if(queue.contains(x)){
                // queue에서 뽑은 값이 순서와 맞지 않는경우
                // 수강순서를 잘못 들은 것으로 NO를 리턴
                if(x!=queue.poll())
                    return "NO";
            }
        }

        if(!queue.isEmpty())
            return "NO";

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(solution(str1,str2));
    }
}
