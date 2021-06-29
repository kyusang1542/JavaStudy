package com.inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class exam4_01 {
    public static char solution(int num, String str){
        char answer = '0';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : str.toCharArray()){
            // key 값이 안들어가 있으면 0을 넣음
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int max = Integer.MIN_VALUE;
        // keySet()은 현재 HashMap에 있는 모든 키를 리턴해줌
        for(char key : map.keySet()){
            // System.out.println(key+" "+map.get(key));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(num, str));
    }
}
