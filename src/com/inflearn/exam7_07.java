package com.inflearn;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
    int data;
    Node2 lt, rt;
    public Node2(int val){
        data=val;
        lt=rt=null;
    }
}

public class exam7_07 {
    Node2 root;
    public void BFS(Node2 root){
        Queue<Node2> queue = new LinkedList<>();
        queue.offer(root);
        // 현재 노드의 레벨을 L로 저장
        int L=0;
        while (!queue.isEmpty()){
            int len = queue.size();
            // 현재 노드 레벨을 출력
            System.out.print(L + " : ");
            for(int i=0; i<len; i++){
                // 현재 노드의 값을 큐에서 빼고 출력함
                Node2 cur = queue.poll();
                System.out.print(cur.data+" ");
                // 왼쪽 노드의 값이 비어있지 않다면 왼쪽 노드의 값을 큐에 넣음
                if(cur.lt!=null) queue.offer(cur.lt);
                // 오른쪽 노드의 값이 비어있지 않다면 오른쪽 노드의 값을 큐에 넣음
                if(cur.rt!=null) queue.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        exam7_07 tree = new exam7_07();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        tree.BFS(tree.root);
    }
}
