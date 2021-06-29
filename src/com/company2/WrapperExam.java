package com.company2;

// java.lang 패키지/오토박싱
public class WrapperExam {
    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5);

        // 오토박싱
        // 기본 타입 데이터를 객체 타입의 데이터로 자동 형변환 시켜주는 기능
        // 7행 처럼 선언하지 않고도 다음과 같이 선언이 가능하다.
        Integer i3 = 5;

        int i4 = i3.intValue();

        // 오토언박싱
        // 오토박싱과 반대로 객체 타입의 데이터를 기본형 타입 데이터로 자동 형변환
        // 14행 처럼 선언하지 않고도 다음과 같이 선언이 가능하다.
        int i5 = i3;

        // int와 Integer의 차이
        // int -> 산술 연산이 가능하다, null로 초기화 할 수 없다.
        // Integer -> Unboxing을 하지 않으면 산술 연산이 불가능하지만 null 값 처리 가능
        // null 값 처리가 용이하기 때문에 SQL과 연동할 경우 처리가 용이하다.
        // DB에서 자료형이 정수형이지만 null 값이 필요한 경우 VO에서 Integer를 사용 할 수 있음
    }

}