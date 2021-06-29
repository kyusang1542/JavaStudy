package com.study;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class test6 {
    public static int solution(int[] priorities, int location){
        int answer = 0;

        // 큐 먼저들어간 자료구조가 먼저 나오는 구조
        // PriorityQueue는 그냥 만들면 최소값 기준으로 우선순위가 정렬되고
        // PriorityQueue<>(Collections.reverseOrder()) 는 최대값 기준으로 우선순위가 정렬된다
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int pqAdd : priorities)
            pq.offer(pqAdd);

        while (!pq.isEmpty()){
            // i는 실제 문서의 위치값을 의미함 i=0은 A를 의미
            for(int i=0; i< priorities.length; i++){
                if(pq.peek() == priorities[i]){
                    pq.poll();
                    answer++;
                    if(location == i){
                        // 큐에 쌓인 자료를 모두 지워버림
                        pq.clear();
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2,1,3,2};
        int location = 1;
        System.out.println(solution(priorities,location));
    }
}
