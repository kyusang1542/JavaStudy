package com.company2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//Calendar
// Date의 단점을 해결하고 등장한 것이 Calendar 클래스
public class CalendarExam {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        // 자바는 0월~11월로 표한함으로 +1을 하여 사용해야함
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));

        // 12시간으로 시간을 출력
        System.out.println(cal.get(Calendar.HOUR));
        // 24시간으로 시간을 출력
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));

        System.out.println("----------------------");

        // 시간을 5시간 후로 바꿈
        cal.add(Calendar.HOUR, 5);

        System.out.println(cal.get(Calendar.YEAR));
        // 자바는 0월~11월로 표한함으로 +1을 하여 사용해야함
        System.out.println(cal.get(Calendar.MONTH)+1);
        System.out.println(cal.get(Calendar.DATE));

        // 12시간으로 시간을 출력
        System.out.println(cal.get(Calendar.HOUR));
        // 24시간으로 시간을 출력
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));


    }
}
