package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        /*
            생성(사용) 절차 - 일단 스트림을 생성
            1. 배열 생성 -> stream 변환
            2. List 생성 -> stream 변환
            3. generate 메소드 -> stream 생성
            4. 범위 지정 -> stream 생성
            5. 빌더(Builder) -> stream 생성

            중간(가공) 절차
            1. map(Function) - 가장 많이 사용
            2. filter(Predicate) - 조건(boolean)
            3. sorted(Comparator) - Function 유사

            최종(결과) 절차
            1. collect - Stream -> List
            2. 반복자 - forEach

            => 반복을 위해서 사용
            데이터의 묶음을 새로운 스트림으로 만들거나
            조건에 맞는 새 스트림을 만들거나
            정렬을 통해 새 스트림을 생성(가공)
            가공된 스트림을 출력하거나 다른 리스트로 생성
        */

        // map
        Stream<Integer> st1 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});  // 생성
        System.out.println(st1);
        List<Integer> list = st1.map(n -> n * 2) // 새 stream에 담기(가공)
                .peek(n -> System.out.println(n))   // 가공(유팅성) stream을 실행하는 동안 결과를 확인할 때 사용
                .collect(Collectors.toList());      // 최종(List로 변경)

        list.forEach(n -> System.out.println("n : " + n));

        // filter
        List<Integer> filteringList = list.stream()
                .map(n -> n / 2)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteringList);

        // sorted
        List<Integer> sortedList = list.stream()
                .sorted((o1, o2) -> o2 - o1)   // 기본값은 오름차순(o1 - o2), 내림차순(o2 - o1)
                .collect(Collectors.toList());

        System.out.println(sortedList);

        // 빌더
        // 타입 지정
        Stream<String> nameStream = Stream.<String>builder()
                .add("sch2")
                .add("sch1")
                .add("sch3")
                .build();

//        nameStream.sorted().forEach(name -> System.out.println(name));

        // CASE_INSENSITIVE_ORDER : String의 해쉬값 비교
//        nameStream
//                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2))
//                .forEach(name -> System.out.println(name));

        // Objects.hash() : String의 해쉬값 비교
        nameStream
                .sorted((o1, o2) -> Objects.hash(o1) - Objects.hash(o2))
                .forEach(name -> System.out.println(name));
        System.out.println("===============================");
        List<Phone> phoneList = List.of(
          Phone.builder().number(1).model("아이폰").build(),   
          Phone.builder().number(2).model("갤럭시").build(),      
          Phone.builder().number(3).model("샤오미").build()
        );

        phoneList.stream()
                .map(phone -> Phone.builder()
                        .number(phone.getNumber() * 2)
                        .model(phone.getModel())
                        .build())
                .forEach(phone -> System.out.println(phone));
        System.out.println("===============================");
        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));
        System.out.println("===============================");
        // number로 정렬 / model명으로 정렬(hash값) / 두가지를 합쳐서 정렬
        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));
        System.out.println("===============================");
        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))        //  CASE_INSENSITIVE_ORDER로 String의 hash값 비교
                .forEach(System.out :: println);    // = .forEach(phone -> System.out.println(phone));
    }
}
