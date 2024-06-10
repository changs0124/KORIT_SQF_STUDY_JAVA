package com.study.java_study.ch17_컬랙션;

import java.util.*;

/*
    HashSet
    1. 인덱스 없음 -> forEach
*/

public class StringHashSetMain {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();
        Set<String> strSet1 = new HashSet<>();

        // 추가
        strSet1.add("sch1");
        strSet1.add("sch2");
        strSet1.add("sch3");
        strSet1.add("sch4");

        System.out.println(strSet1);

        for (String name : strSet1) {
            System.out.println(Objects.hash(name));
        }

        // 같은 컬렉션 인터페이스 이기 때문에 서로 대입이 가능함
        List<String> strList = new ArrayList<>();
        strList.addAll(strSet1);

        System.out.println(strList);

        // Set은 중복을 허용 X => ArrayList -> Set 대입할 경우 중복이 없는 List 만들 수 있다.(중복 제거)
        strSet1.addAll(List.of("sch1", "sch1", "sch2"));
        System.out.println(strSet1);
        strList.addAll(strSet1);
        System.out.println(strList);

        // 정렬(내림차순)
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            }
        };

        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
        System.out.println(strList);
    }
}
