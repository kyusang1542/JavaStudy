package com.company;

//익명클래스
// 만약 Action이 한 번만 사용되는 경우라면 MyAction을 만들어
// 다시 선언 후 사용하는 것은 매우 비생산적인 활동 일 수 있음
// 이런 경우 아래와 같이 익명클래스로 선언과 동시에 사용이 가능함
public class ActionExam {
    public static void main(String[] args){
//        Action action = new MyAction();
//        action.exec();
        Action action = new Action() {

            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}
