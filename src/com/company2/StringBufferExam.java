package com.company2;

// 스트링버퍼
public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // 스트링버퍼에 문자열을 추가하는 명령어 append()
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        // 메소드 체이닝
        // 자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        if(sb2 == sb3)
            System.out.println("sb2 == sb3");
        System.out.println(sb2.hashCode());
        System.out.println(sb3.hashCode());

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);

        // StringBuffer()를 쓰는 이유
        // 자바에서 String은 불변객체이다 즉, 한 번 생성되면 그 내용을 바꿀 수 없다.
        // String a = "Hello"; 라고 선언 후 a += " World";를 실행하면
        // 내부적 으로는 a = new StringBuffer(a).append(" World").toString();으로 변환된다.
        // String 객체는 불변이기 때문이다.
        // 이러한 동작이 한 번 실행 될 때마다 new StringBuffer를 반복하게 되므로 메모리에 비효율적이다.
        // 그렇기 때문에 자주 변경될 String문은 StringBuffer로 선언하여 작성해주면 메모리에 효율적ㅇ이다.
    }
}
