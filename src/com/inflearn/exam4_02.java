package com.inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class exam4_02 {
    public static String solution(String word1, String word2){
        String answer = "YES";

        HashMap<Character, Integer> word1Map = new HashMap<>();
        for(char x : word1.toCharArray()){
            word1Map.put(x, word1Map.getOrDefault(x, 0)+1);
        }

        for(char x : word2.toCharArray()){
            if(!word1Map.containsKey(x) || word1Map.get(x)==0)
                return "NO";
            // get()으로 해당 value 값을 가져와서 -1을 해준다.
            word1Map.put(x, word1Map.get(x)-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String word1 = kb.next();
        String word2 = kb.next();
        System.out.println(solution(word1, word2));
    }
}
