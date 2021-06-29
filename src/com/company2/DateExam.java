package com.company2;

import java.text.SimpleDateFormat;
import java.util.Date;

// Date
// 날짜와 시간을 구하기 위한 클래스 Date 클래스
public class DateExam {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        // 연도,달,날 / at / 시,분,초 / 오전or오후 / 타임존
        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));

        // 현재 시간을 long 타입으로 반환
        System.out.println(date.getTime());

        // 시스템의 현재 시간을 long 값으로 반환
        long today = System.currentTimeMillis();
        System.out.println(today);

        // 10번 코드와 21번 코드 사이에 걸린 시간을 반환
        System.out.println(today - date.getTime());
    }
}
