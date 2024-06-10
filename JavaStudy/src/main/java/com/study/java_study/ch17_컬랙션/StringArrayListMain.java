package com.study.java_study.ch17_컬랙션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayListMain {
    public static void main(String[] args) {

        String[] strArray = new String[10];
        ArrayList<String> strList = new ArrayList<>();

        strList.add("test1");
        strList.add("test2");
        strList.add("test3");
        strList.add("test4");
        strList.add("test5");

        // 배열을 리스트로 변환
        List<String> lsit = Arrays.asList(strArray);        // *******업캐스팅 : 확장성 때문에 사용*******
        ArrayList<String> list2 = new ArrayList<>();        // 새 ArrayList 생성
        list2.addAll(lsit);                                 // 전부 넣기

        // 리스트를 배열로 변환
        String[] strArray2  = strList.toArray(new String[strList.size()]);

        // 리스트 값 조회
        System.out.println(strList);

        // contains 포함 여부
        System.out.println(strList.contains("test1"));

        // 리스트 바로 생성
        List<Integer> nums = List.of(1, 2, 3, 4, 5);    // 데이터 추가 수정 X

        System.out.println(nums);

        // 리스트 삭제
//        nums.remove();       // index : 삭제한 해당 값을 리턴(제거하고 가지고 나왔다)
//        nums.remove();        // object : 삭제한 값을 지우고 boolean 리턴(없으면 false 리턴)
//        nums.removeAll();     // collection : 해당 컬렉션과 중복된 값만 제거후 boolean 리턴

        System.out.println(strList);
        System.out.println(strList.remove("test1"));    // 해당 값 제거 후 boolean 리턴
        System.out.println(strList);
        System.out.println(strList.remove(1));          // 해당 인덱스 값 리턴
        System.out.println(strList);

        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums);
        System.out.println(nums3);
        System.out.println(nums3.removeAll(List.of(1, 3, 5)));  // ArrayList 에서 removeAll 가능(지울 값을 어레이 리스트에 담은 후 removeAll 메소드 사용)
        System.out.println(nums3);

        // 수정
        nums3.set(0, 10);
        nums3.addAll(List.of(1, 2, 3));
        System.out.println(nums3);

        nums3.remove(2);
        System.out.println(nums3);

        // 반복
        for (int i = 0; i < nums3.size(); i++) {
            System.out.println(nums3.get(i));
        }
        for (Integer num : nums3) {
            System.out.println(num);
        }

        Iterator<Integer> ir = nums3.iterator();    // 자바의 컬렉션(Collection)에 저장되어 있는 요소들을 순회하는 인터페이스
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }
}
