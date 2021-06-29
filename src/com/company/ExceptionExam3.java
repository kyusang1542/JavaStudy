package com.company;

// Exception 발생시키기
public class ExceptionExam3 {
    public static void main(String[] args){
        int i = 10;
        int j = 0;
        try{
            int k = divide(i, j);
            System.out.println(k);
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
    }

    // 21번째 라인에서 발생시킨 에러를 throws로 받아서 divide를 호출한 쪽으로 넘김
    public static int divide(int i, int j) throws IllegalArgumentException{
        if(j==0){
            // throw를 적어서 강제로 오류를 발생시킬 수 있음
            // 해당 오류에 대한 설명을 적을 수 있음 이 설명은 e.toString()으로 출력가능
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = i/j;
        return k;
    }
}

