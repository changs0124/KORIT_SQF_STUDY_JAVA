package com.study.java_study.ch17_컬랙션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();
        
        // Map은 Collection 인터페이스를 상속 받지 않기 때문에 add X -> 독자적인 인터페이스를 가짐 put
        // Map도 List처럼 사용 가능 -> 그럴거면 List를 사용하자
        strMap.put(10, "sch1");
        strMap.put(11, "sch2");
        strMap.put(12, "sch3");
        strMap.put(13, "sch4");

        System.out.println(strMap);

        // key = Object / value = String
        System.out.println(strMap.get(0));  // null
        System.out.println(strMap.get(10));  // sch1

        // .of : 해당 컬렉션을 무엇으로 구성할거냐(여러가지 값 한번에 입력)
        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java"));

        // Entry : 제네릭  => Lambda
        // Key의 중복을 허용 X -> List에는 대입 할 수 없다.
        // Key와 value값을 묶어서 Set에 대입
        Set<Map.Entry<String, String>> entries = lang.entrySet();

        // forEach로 반복
        for (Map.Entry<String, String> entry : entries) {       // Set의 Entry(key=value)에서 .get 메소드를 이용해서 key와 value 추출
            System.out.println("key : " + entry.getKey());      // key값
            System.out.println("value : " + entry.getValue());  // value값
        }


    }
}
