package com.company2;

//Generic
public class BoxExam {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("hello");
        String str = (String)box.getObj();
        System.out.println(str);

        box.setObj(1);
        int value = (int)box.getObj();
        System.out.println(value);

        //Generic 선언부

        Box<Object> box2 = new Box<>();
        box.setObj2(new Object());
        Object obj2 = box2.getObj2();
        System.out.println(obj2);

        Box<String> box3 = new Box<>();
        box3.setObj2("hello");
        String str2 = box3.getObj2();
        System.out.println(str2);

        // 오토언박싱으로 인해서 자동으로 int로 바꾸어 줌
        Box<Integer> box4 = new Box<>();
        box4.setObj2(4);
        int value2 = box4.getObj2();
        System.out.println(value2);
    }
}
