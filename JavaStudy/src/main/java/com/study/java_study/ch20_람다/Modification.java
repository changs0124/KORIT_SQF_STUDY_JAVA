package com.study.java_study.ch20_람다;


/*  
    람다(Lambda)
    1. 하나의 추상 메소드를 정의 하고 있는 인터페이스에서 사용한다.(람다식에는 메소드 명을 따로 적지 않기 때문에 해당 인터페이스나 추상 클래스에서는 메소드가 하나만 있어야한다.)
    2. 매개변수의 타입을 생략 할 수 있다.
    3. 매개변수가 하나이면 매개변수를 감싸는 () 괄호를 생략 할 수 있다.
    4. 리턴 다른 명령 없이 바로 리턴만 한다면 메소드를 정의하는 {} 중괄호와 return 키워드를 생략 할 수 있다.
    5. 익명 클래스를 사용하는 데 있어 간결한 것이 핵심
    6. 재사용 불가 -> 재사용을 할 메소드 였으면 클래스로 생성
    https://bangu4.tistory.com/215
*/

// 람다 전용 인터페이스 어노테이션(함수 하나만을 위해 존재)
@FunctionalInterface
public interface Modification<T> {
    T modify(T oldData, T newData);     // return 자료형에도 타입 지정 가능
//    T modify2(T oldData, T newData);

    
}
