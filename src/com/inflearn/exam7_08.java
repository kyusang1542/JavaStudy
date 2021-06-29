package com.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 최단거리를 구하는 알고리즘
public class exam7_08 {
    static int answer = 0;
    static int[] dis = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> queue = new LinkedList<>();

    public static int BFS(int S, int E){
        // 좌표의 점 바로 다음까지를 배열의 사이즈로 만들어준다.
        ch = new int[10001];
        // 출발 지점의 좌표의 위치를 1로 표시한다.
        // ch[] 배열에서 1이 있는 곳은 이동한 적이 있음을 의미한다.
        ch[S] = 1;
        // 출발 지점을 queue에 넣는다.
        queue.offer(S);
        // 현재 노드의 레벨을 L로 저장
        int L = 0;
        while (!queue.isEmpty()){
            // 현재 레벨에 있는 queue의 갯수가 len이다.
            int len = queue.size();
            for(int i=0; i<len; i++){
                // 현재 queue에 있는 값을 빼서 +1, -1, +5를
                // 해주기위해 poll() 후 x에 저장
                int x = queue.poll();
                for (int j=0; j<3; j++){
                    // for문을 통해 x의 값을 차례로 +1, -1, +5 하여 nx에 저장
                    int nx = x+dis[j];
                    // 혹시 nx가 원하는 값 E에 도달하면 원하는 위치에 도착을
                    // 한 것임으로 도착한 위치의 노드 레벨의 +1을 리턴
                    // (노드 레벨 +1이 최소 이동 횟수이다.)
                    if(nx==E){
                        return L+1;
                    }
                    // nx가 음수(후퇴)하면 안됨으로 1~10000 사이를 조건으로 걸고
                    // 이동을 한 적이 있다면 그곳은 중복으로 또 갈 필요가 없음으로
                    // ch[]==0 일때를 조건으로 건다.
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        // 이 조건을 모두 만족했다면 이동한 적이 없다는 의미임으로
                        // 해당 nx 값의 이동한 적이 있다는 의미로 위치를 1로 바꾸어준다.
                        ch[nx]=1;
                        // 해당 nx 값을 queue에 추가해준다.
                        queue.offer(nx);
                    }
                }
            }
            // 반복문이 끝났음으로 노드 레벨을 증가시켜준다.
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int E = kb.nextInt();
        System.out.println(BFS(S,E));
    }
}
