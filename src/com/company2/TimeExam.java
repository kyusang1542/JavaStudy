package com.company2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

// java.time 패키지
public class TimeExam {
    public static void main(String[] args) {
        // 지금 현재 시간 반환
        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);

        System.out.println("------------------");

        // 날짜를 지정하여 반환
        LocalDate Id1 = LocalDate.of(2012, Month.DECEMBER ,12);
        System.out.println(Id1);

        System.out.println("------------------");

        LocalTime It1 = LocalTime.of(17, 18);
        System.out.println(It1);
        LocalTime It2 = LocalTime.parse("10:15:30");
        System.out.println(It2);

        System.out.println("------------------");

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        // getMonth()는 영문 날짜로 반환
        Month month = timePoint.getMonth();
        // getMonthValue()는 숫자 날짜로 반환
        System.out.println(timePoint.getMonthValue());
        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());
    }
}
