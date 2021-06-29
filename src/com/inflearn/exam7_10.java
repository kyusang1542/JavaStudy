package com.inflearn;

import java.util.LinkedList;
import java.util.Queue;

class Node4{
    int data;
    Node4 lt, rt;
    public Node4(int val){
        data=val;
        lt=rt=null;
    }
}

public class exam7_10 {
    Node4 root;
    public int BFS(Node4 root){
        Queue<Node4> queue = new LinkedList<>();
        queue.offer(root);
        int L=0;
        while (!queue.isEmpty()){
            int len=queue.size();
            for(int i=0; i<len; i++){
                Node4 cur = queue.poll();
                // 자식 노드가 좌 우로 모두 없는경우 그것이 최단 경로이므로
                // 바로 레벨값 리턴
                if(cur.lt==null && cur.rt==null) return L;
                if(cur.lt!=null) queue.offer(cur.lt);
                if(cur.rt!=null) queue.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        exam7_10 tree = new exam7_10();
        tree.root = new Node4(1);
        tree.root.lt = new Node4(2);
        tree.root.rt = new Node4(3);
        tree.root.lt.lt = new Node4(4);
        tree.root.lt.rt = new Node4(5);
        System.out.println(tree.BFS(tree.root));
    }
}
