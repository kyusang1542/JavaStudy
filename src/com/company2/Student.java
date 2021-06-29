package com.company2;

import java.util.Objects;

// Object와 오버라이딩
// 해당 기능을 사용하기 위해서는 반드시 오버라이딩을 하여 사용해야 함
public class Student {
    String name;
    String number;
    int birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number.equals(student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1995;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1995;

        // art + insert -> equals and hashCode
        // 해쉬코드를 서로 맞춰줌
        if(s1.equals(s2))
            System.out.println("s1 == s2");
        else
            System.out.println("s1 != s2");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // art + insert -> toString
        // toString값을 출력함
        System.out.println(s1);
        // 직접 toString()을 입력하여 출력도 가능
        System.out.println(s1.toString());
    }
}
