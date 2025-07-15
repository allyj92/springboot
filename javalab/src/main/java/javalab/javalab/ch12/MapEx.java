package javalab.javalab.ch12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Map 인터페이스
// -Key, Value 쌍으로 관리
// - Key는 중복 혀용을 안함, Value는 중복 허용

public class MapEx {
    public static void main(String[] args) {

        // HashMap
        // - 입력된 순서가 유지되지 않음
        System.out.println("=========== HashMap ===========");
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("A","사과");
        hashMap.put("C","바나나");
        hashMap.put("B","수박");
        hashMap.put("F","배");
        hashMap.put("B","귤"); // 키가 중복될 경우 해당 키의 값을 수정한다.

        for(String key : hashMap.keySet()){
            String value = hashMap.get(key);
            System.out.println(value);
        }

        hashMap.forEach((k,v) ->
                System.out.println("forEach ==>" +k+":"+v));

        System.out.println(hashMap.size());
        System.out.println(hashMap.get("A"));
        System.out.println(hashMap.containsKey("G"));
        System.out.println(hashMap.containsValue("귤"));



        // - LinkedHashMap
        // - 입력된 순서가 유지됨
        System.out.println("=========== LinkedHashMap ===========");
        Map<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("A","사과");
        linkedMap.put("C","바나나");
        linkedMap.put("B","수박");
        linkedMap.put("F","배");
        linkedMap.put("B","귤"); // 키가 중복될 경우 해당 키의 값을 수정한다.

        linkedMap.forEach((k,v) ->
                System.out.println("forEach ==>" +k+":"+v));

    }
}
