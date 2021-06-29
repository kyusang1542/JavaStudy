package com.company;

public class StringMethodExam {
    public static void main(String[] args){
        //String str = new String("hello");
        String str = "hello";

        // 문자열의 길이를 출력함
        System.out.println(str.length());

        // 문자열과 문자열을 결합해줌
        System.out.println(str.concat(" world"));
        // String은 참조변수이기 때문에 값이 변하지 않음
        System.out.println(str.substring(2,4));

        // String의 값을 바꾸어 주려면 다음과 같이 직접 대입을 해주어야 함
        str = str.concat(" world");
        System.out.println(str);

        // 문자열을 자름
        // index값 3이후의 값만 남김 (index는 0부터 시작)
        System.out.println(str.substring(3));
        // index값 3이후부터 7이전의 값만 남김 (index는 0부터 시작)
        System.out.println(str.substring(3, 7));
    }
}
