package com.company2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIOExam01 {
    public static void main(String[] args) {
        // System.in은 키보드로 부터 입력을 받는 동작을 의미한다
        // 하지만 System.in을 BufferedReader에 바로 사용할 수는 없는데
        // BufferedReader는 Reader 객체만 사용이 가능하기 때문이다.
        // 이때 System.in을 넣을 수 있는 InputStreamReader(Reader객체)를 가져온 후
        // 이를 또 사용하여 BufferedReader에 넣어 사용한다.
        // 이러한 방식을 데코레이터 패턴이라고 하는데 정의는 다음과 같다.
        // 객체에 추가적인 요건(기능)을 동적으로 첨가하는 방식
        // 서브 클래스를 만드는 것을 통해 기능을 유연하게 확장할 수 있는 방법 제공
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;

        try {
            // 키보드로 부터 입력을 받은 값을 line 변수에 넣어줌
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(line);
    }
}
