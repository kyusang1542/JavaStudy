package com.study;

import java.util.LinkedList;
import java.util.Queue;

public class test7_2 {
    public static int Solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        // 다리가 받고 있는 무게
        int max = 0;

        for(int w : truck_weights){
            while (true){
                // 큐가 비어있으면 트럭의 무게를 넣는다.
                if(q.isEmpty()){
                    q.offer(w);
                    max += w;
                    answer++;
                    break;
                // 트럭이 다리를 다 지났으면, queue 크기는 다리 길이와
                // 동일하므로 queue에서 꺼내 최대 무게에서 빼준다
                } else if(q.size() == bridge_length){
                    max -= q.poll();
                } else {
                    // 큐가 비어있지 않고 무게가 초과될 때 0을 넣는다
                    if(max + w > weight) {
                        q.offer(0);
                        answer++;
                    // 큐가 비어있지 않고, 무게가 충분할 때 트럭의 무게를 넣는다
                    } else {
                        q.offer(w);
                        max += w;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(Solution(bridge_length, weight, truck_weights));
    }
}
