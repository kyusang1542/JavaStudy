package com.company2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Byte 단위 입출력
public class ByteExam1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/com/company2/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            // byte로 선언할 경우 끝을 나타낼 방법이 없기 때문에 int로 선언 후
            // int -1을 만날 경우 파일의 끝임을 알려준다.
            int readData = -1;
            // FileInputStream이 가지고 있는 read() 메서드를 이용하여 파일
            // 안의 데이터가 -1이 아닐경우 readData에 넣음
            while ((readData = fis.read()) != -1){
                // readData의 데이터를 fos에 write() 메서드를 이용하여 내보냄
                fos.write(readData);
            }

        } catch (Exception e) {
            e.printStackTrace();
            // fis와 fos을 모두 사용하고 나면 반드시 close 해야한다.
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
