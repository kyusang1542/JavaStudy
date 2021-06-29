package com.company;

public class VariableScopeExam {
    // 변수의 사용 범위
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
        // System.out.println(localScope);  사용불가
        // System.out.println(value);   사용불가
        System.out.println(value2);
        System.out.println(staticVal);
    }

    public static void main(String[] args){
        // System.out.println(globalScope);
        // System.out.println(localScope);
        // System.out.println(value);
        System.out.println(staticVal);

        System.out.println("-----------------");

        // 인스턴스 변수라고 함
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        System.out.println("-----------------");

        // static 변수는 값을 저장할 수 있는 공간이 하나 밖에 없음, 즉 공간을 공유함
        // 이러한 변수를 클래스 변수라고 함
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);

        System.out.println("-----------------");

        // static 변수는 위와 같이 사용하면 혼동을 줄 수 있기 때문에 아래와 같이 사용용
       System.out.println(VariableScopeExam.staticVal);
    }
}
