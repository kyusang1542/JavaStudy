package com.inflearn;

public class exam7_06 {
    static int num;
    static int[] ch;
    public static void DFS(int L){
        // 입력된 L값과 num+1 값이 같게 될 경우 num의 부분집합의 경우에 수를 모두
        // 표현이 가능해 짐으로 DFS를 종료후 출력한다.
        if(L==num+1){
            String tmp="";
            for(int i=1; i<=num; i++){
                // ch[i]에 1이 들어있다면 해당 숫자를 tmp에 더하고 아니라면 더하지 않는다.
                if(ch[i]==1)
                    tmp+=(i+" ");
            }
            // tmp값이 공집합(0)인지 확인하고 0이 아니라면 출력한다.
            if(tmp.length()>0)
                System.out.println(tmp);
        }
        else{
            // 왼쪽 노드를 만든 후 1을 넣어 출력을 할 값임을 표시한다.
            ch[L]=1;
            DFS(L+1);
            // 오른쪽 노드를 만든 후 0을 넣어 출력하면 않되는 값임을 표시한다.
            ch[L]=0;
            DFS(L+1);
        }
    }
    public static void main(String[] args) {
        num=3;
        ch=new int[num+1];
        DFS(1);
    }
}
