package com.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test8 {
    public static int[] solution(int[] prices){
        int[] answer = new int[prices.length];

        // 현재 비교할 prices 위치 저장
        int pricesNumSave = 1;
        // q.poll 로 빼낸 값 임시 저장
        int pollNumSave = 0;
        // return 할 값 count
        int count = 0;

        ArrayList<Integer> ArrayNum = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        for(Integer i : prices){
            q.offer(i);
        }

        while (!q.isEmpty()){
            pollNumSave = q.poll();

            for(int i = pricesNumSave; i<prices.length; i++){
                if(pollNumSave <= prices[pollNumSave])
                    count++;
                else if (pollNumSave > prices[pollNumSave]){
                    count++;
                    break;
                }
            }
            ArrayNum.add(count);
            count = 0;
            pricesNumSave++;
        }

        for(int i = 0; i<ArrayNum.size(); i++){
            answer[i] = ArrayNum.get(i);
        }

        System.out.println(ArrayNum.get(0));
        System.out.println(ArrayNum.get(1));
        System.out.println(ArrayNum.get(2));
        System.out.println(ArrayNum.get(3));
        System.out.println(ArrayNum.get(4));

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};
        System.out.println(solution(prices));
    }
}
