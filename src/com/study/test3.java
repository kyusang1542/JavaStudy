package com.study;

import java.util.HashMap;

public class test3 {

    public static int solution(String[][] clothes){
        int answer = 1;

        HashMap<String, Integer> clothesSet = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            clothesSet.put(clothes[i][1], clothesSet.getOrDefault(clothes[i][1], 0)+1);
        }

        System.out.println(clothesSet.keySet());

        for (String keys : clothesSet.keySet()) {
            answer *= (clothesSet.get(keys) + 1);
        }

        answer -= 1;

        return answer;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }
}
