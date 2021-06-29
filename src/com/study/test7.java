package com.study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test7 {
    public static int Solution(int bridge_length, int weight, int[] truck_weights){
        int answer = 0;

        Queue<Integer> bridgeOn = new LinkedList<>();
        ArrayList<Integer> bridgeOnTime = new ArrayList<>();

        // 현재 다리가 견디고 있는 무게
        int nowWeights = 0;
        // 현재 경과 시간
        int timeCount = 0;


        for(int i=0; i<truck_weights.length; i++){
            if(nowWeights+truck_weights[i]<weight){
                System.out.println("현재 다리를 건너기 충분한 무게 입니다.");
                bridgeOn.offer(truck_weights[i]);
                nowWeights += truck_weights[i];
                bridgeOnTime.add(bridge_length);
                timeCount++;
                System.out.println("nowWeights : " + nowWeights);
                System.out.println("timeCount : " + timeCount);
                System.out.println("bridgeOn.peek : " + bridgeOn.peek());
                System.out.println("------if 끝------");
            }else {
                System.out.println("현재 다리를 건너기 어려운 무게 입니다.");
                for(int j=0; j<bridgeOnTime.size(); j++){
                    bridgeOnTime.set(j, (bridgeOnTime.get(j)-1));
                    timeCount++;
                    System.out.println("timeCount : " + timeCount);
                }
                i--;
                System.out.println("nowWeights : " + nowWeights);
                System.out.println("bridgeOn.peek : " + bridgeOn.peek());
                System.out.println("-----else 끝------");
            }

            for(int k=0; k<bridgeOnTime.size(); k++){
                if(bridgeOnTime.get(k) == 0){
                    System.out.println("bridgeOn.peek : " + bridgeOn.peek());
                    nowWeights -= bridgeOn.poll();
                    bridgeOnTime.set(k, -1);
                    System.out.println("bridgeOn.peek NEXT: " + bridgeOn.peek());
                }
                System.out.println("-----for 끝-----");
            }
        }

        return timeCount;
    }

    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        System.out.println(Solution(bridge_length, weight, truck_weights));
    }
}
