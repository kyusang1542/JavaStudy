package com.company;

public class StringExam {
    public static void main(String[] args){
        // new를 적지 않고 만들면 hello 상수를 하나 만들고 참조하게 되고
        // 다음 str2가 hello를 만들려하면 같은 hello가 있을 경우
        // 만들지 않고 기존의 hello 상수값 위치를 참조하게 된다.
        // 결론적으로 str1과 str2는 같은 상수값 위치를 가르키게 된다.
        String str1 = "hello";
        String str2 = "hello";

        // new가 나왔을때는 위와는 다르게 힙 영역에 무조건 적으로 만든다.
        // 결론적으로 str3과 str4는 다른 상수값 위치를 가르키게 된다.
        String str3 = new String("hello");
        String str4 = new String("hello");

        // 참조형이기 때문에 같은 주소값을 가지고 있는지 비교
        if(str1 == str2)
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");

        if(str1 == str3)
            System.out.println("str1과 str3는 같은 레퍼런스입니다.");

        if(str3 == str4)
            System.out.println("str3과 str4는 같은 레퍼런스입니다.");

        System.out.println(str1);
        // substring(3) 수행한 다음에 새로운 String 값을 만든 다음에 반환함
        // 때문에 기존 str1 값이 바뀌지 않음
        // substring()은 인덱스 값을 기준으로 그 앞을 자른 후 출력하라는 의미임
        System.out.println(str1.substring(3));
        // String은 한 번 만들어지면 변경되지 않음
        System.out.println(str1);

        // 문자열이 같은지 확인하고 싶은 경우
        if(str3.equals(str4)){
            System.out.println("str3과 str4의 문자열은 같습니다.");
        }else{
            System.out.println("str3과 str4의 문자열은 다릅니다.");
        }
    }
}
