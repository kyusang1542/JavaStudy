package com.company2;

import java.io.DataInputStream;
import java.io.FileInputStream;

// 다양한 타입의 입력
// ByteExam3에서 만든 data.txt파일을 읽어들임
// 파일 자체를 읽을 수는 없지만 데이터 타입 자체로 저장을 해두고
// 데이터 타입 자체를 다시 읽어서 사용 할 수 있음
public class ByteExam4 {
    public static void main(String[] args) {
        try(
                DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
                ){
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();

            System.out.println(i);
            System.out.println(b);
            System.out.println(d);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
