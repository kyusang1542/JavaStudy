package com.company;

public class TypeCastingExam {
    // 기본형 타입 변환
    public static void main(String[] args){
        // 작은 데이터 타입에서 큰 데이터 타입으로 이동할 때는 문제가 없음
        // 이러한 경우를 묵시적 형변환이라 함
        int x = 50000;
        long y = x;

        // 큰 데이터 타입에서 작은 데이터 타입으로 이동할 때는 데이터 크기가
        // 잘리지 않고 잘 들어가는지 확인이 필요하며 이동을 할 때는
        // 앞에 데이터 타입을 적어주어야함 ex) (int)x2
        // 이러한 경우를 강제 형변환이라 함
        long x2 = 5;
        int y2 = (int)x2;
    }
}
