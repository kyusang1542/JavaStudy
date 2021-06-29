package com.inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class exam4_04 {
    public static int solution(String word1, String word2){
        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // word2를 HashMap인 map2에 넣어서 비교를 함
        for(char x : word2.toCharArray())
            map2.put(x, map2.getOrDefault(x, 0)+1);

        // word2를 HashMap인 map에 넣어서 하나씩 이동하며 비교 함
        for(int i=0; i<word2.length()-1; i++){
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0)+1);
        }

        int lt = 0;

        for(int rt=word2.length()-1; rt<word1.length(); rt++){
            map.put(word1.charAt(rt), map.getOrDefault(word1.charAt(rt), 0)+1);
            // HashMap 끼리는 equals를 이용하여 서로 비교가 가능
            if(map.equals(map2))
                answer++;

            map.put(word1.charAt(lt), map.get(word1.charAt(lt))-1);
            if(map.get(word1.charAt(lt))==0)
                map.remove(word1.charAt(lt));
            lt++;
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
