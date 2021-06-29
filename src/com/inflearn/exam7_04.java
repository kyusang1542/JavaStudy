package com.inflearn;

public class exam7_04 {
    static int[] fibo;

    public static int DFS(int num){
        if(fibo[num]>0) return fibo[num];
        if(num==1) return fibo[num]=1;
        else if(num==2) return fibo[num]=1;
        else return fibo[num]=DFS(num-2)+DFS(num -1);
    }

    public static void main(String[] args) {
        int n=10;
        fibo=new int[n+1];
        DFS(n);
        for(int i=1; i<=n; i++)
            System.out.print(fibo[i]+ " ");
    }
}
