package com.inflearn;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class exam4_05 {
    public static int solution(int num, int num2, int[] su){
        int answer = -1;

        // TreeSet은 중복을 허용하지 않는다.
        // TreeSet을 그냥 선언하면 오름차순으로 정렬(첫번째가 가장 작은 값)
        // Collections.reverseOrder()를 넣으면 내림차순으로 정렬한다. (첫번째가 가장 큰 값)
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){
                for(int k=j+1; k<num; k++){
                    treeSet.add(su[i]+su[j]+su[k]);
                }
            }
        }

        // count는 몇번째 treeSet에 있는 값인지를 의미함
        int count = 0;
        for(int x : treeSet){
            count++;
            if(count==num2)
                return x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[] su = new int[num1];
        for(int i=0; i<num1; i++){
            su[i] = kb.nextInt();
        }
        System.out.println(solution(num1, num2, su));
    }
}
