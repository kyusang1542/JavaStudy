package com.company2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Byte 단위 입출력 심화
// 한 번에 512바이트씩 읽어들임으로써 수행속도 향상
// OS에서는 기본적으로 512바이트씩 읽어오기 때문에 512바이트씩 읽어오는 것이 좋음
// 이렇게 설정하지 않을 경우 만약 1바이트씩 읽어온다면 512를 읽어 온 후 1바이트를 읽고
// 511바이트는 버린 후 다시 512바이트를 읽어온 후 1바이트를 읽고 511바이트는 버리는
// 작업을 반복하여 수행속도가 매우 느려지고 비효율적임
public class ByteExam2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/com/company2/ByteExam2.java");
            fos = new FileOutputStream("byte.txt");

            // byte로 선언할 경우 끝을 나타낼 방법이 없기 때문에 int로 선언 후
            // int -1을 만날 경우 파일의 끝임을 알려준다.
            int readData = -1;
            // 한 번에 512 바이트 만큼 읽어오기 위해 512바이트의 배열을 선언
            byte[] buffer = new byte[512];
            // FileInputStream이 가지고 있는 read() 메서드를 이용하여 파일
            // 안의 데이터가 -1이 아닐경우 readData에 넣음
            // read(buffer) -> read로 최대 512 byte를 읽음
            while ((readData = fis.read(buffer)) != -1){
                // readData의 데이터를 fos에 write() 메서드를 이용하여 내보냄
                // buffer에 0번째부터 시작하고 readData를 읽는다는 의미
                fos.write(buffer,0,readData);
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
