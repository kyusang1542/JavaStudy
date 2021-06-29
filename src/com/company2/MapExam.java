package com.company2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Map
// Map은 key와 value를 쌍으로 저장하는 자료구조
// 키는 중복될 수 없고, 값은 중복될 수 있다.
public class MapExam {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //map.put(키,값);
        map.put("001","kim");
        map.put("002","lee");
        map.put("003","choi");

        // key값이 중복이 될 수 없기 때문에 기존의 값 001 키를 kang 값으로 바꾼다.
        map.put("001","kang");
        // put으로 4개가 들어왔지만 1개의 키는 중복이어서 대체되었기 때문에 3개로 출력된다.
        System.out.println(map.size());
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));

        // key만 꺼내서 Set 자료구조에 넣어줌
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()){
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
