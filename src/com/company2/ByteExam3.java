package com.company2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// 다양한 타입의 출력
public class ByteExam3 {
    public static void main(String[] args) {
        // try-with-resources
        // 사용한 자원을 자동으로 종료 시켜주는 기능
        // 사용은 try - catch 구문을 사용하는 것과 동일하게 사용하면 된다.
        // 다른 입출력 방식과 다르게 close를 시켜줄 필요가 없다.
        try(
                // 다양한 타입을 저장할 수 있는 객체 DataOutputStream
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
                ){
            // 실제 사용할 코드는 이곳에 적으면 된다.
            // 정수를 저장하는데 4바이트를 차지함으로 4바이트가 사용됨
            out.writeInt(100);
            // 1바이트 사용
            out.writeBoolean(true);
            // 8바이트 사용
            out.writeDouble(50.5);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
