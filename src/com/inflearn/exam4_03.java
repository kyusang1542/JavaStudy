package com.inflearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class exam4_03 {
    public static ArrayList<Integer> solution(int num, int num2, int[] N){

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        // 현재까지 매출액의 구간 -1 을 HashMap에 넣음
        for(int i=0; i<num2-1; i++){
            HM.put(N[i], HM.getOrDefault(N[i], 0)+1);
        }
        int lt=0;
        // 위에서 넣은 매출액 구간 이후부터 HashMap을 한칸씩 앞으로 이동
        for(int rt=num2-1; rt<num; rt++){
            HM.put(N[rt], HM.getOrDefault(N[rt], 0)+1);
            answer.add(HM.size());
            // HashMap에서 가장 첫번째 Key값의 Value 값을 -1하여 HM을 한칸씩 이동하며 매출액 구간 유지
            HM.put(N[lt], HM.get(N[lt])-1);
            // HashMap이 0이되면 더 이상 size가 늘어나면 안되므로 제거
            if(HM.get(N[lt])==0)
                HM.remove(N[lt]);
            lt++;
        }

        return answer;

        //        int[] answer = new int[(num-num2)+1];
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        // 몇번 반복해야 하는지 횟수 (num - num2는 반복해야 하는 횟수이다)
//        for(int i=0; i<(num-num2)+1; i++){
//            for(int j=i; j<i+num2; j++){
//                map.put(N[j], map.getOrDefault(N[j], 0)+1);
//            }
//            answer[i] = map.size();
//            map.clear();
//        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int num2 = kb.nextInt();
        int[] N = new int[num];
        for(int i=0; i<num; i++)
            N[i] = kb.nextInt();
        for(int x : solution(num, num2, N))
            System.out.print(x+" ");
    }
}
