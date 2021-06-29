package com.company;

// 사용자 정의 Exception
public class BizException extends RuntimeException{
    public BizException(String msg){    // 문자열로 된 오류메세지를 담는 생성자
        super(msg);                     // 부모의 생성자에게 메세지를 넘김
    }
    public BizException(Exception ex){  // 실제 발생할 익셉션을 담는 생성자
        super(ex);                      // 부모의 생성자에게 ex를 넘김
    }
}
