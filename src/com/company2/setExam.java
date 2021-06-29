package com.company2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set
//중복이 없고 순서도 없는 자료구조
public class setExam {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        boolean flag1 = set1.add("kang");
        boolean flag2 = set1.add("kim");
        boolean flag3 = set1.add("kang");

        //kang이 중복으로 있기 떄문에 2를 출력
        System.out.println(set1.size());

        System.out.println(flag1);
        System.out.println(flag2);
        // 이미 kang이 들어있기 때문에 false를 반환
        System.out.println(flag3);

        // 하나씩 꺼내보기 위해서는 Iterator를 이용
        Iterator<String> iter = set1.iterator();
        // hasNext는 다음에 가져올 값이 있으면 True 없으면 False를 반환함
        while (iter.hasNext()){
            // iter.next()는 iter의 값을 가져오고 자동으로 다음 값을 참조하게 된다.
            String str = iter.next();
            System.out.println(str);
        }
    }
}
