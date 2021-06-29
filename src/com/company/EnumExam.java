package com.company;

public class EnumExam {
    // 열거형

    // 상수를 선언할때는 대문자로 선언
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        // gender2 = "boy";     enum 값 이외에는 사용할 수 없음음
    }
}

// enum 이름 { 값1, 값2; }
enum Gender{
    MALE,FEMALE;
}