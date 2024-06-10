package com.study.java_study.ch14_Object;

// maven repository에서 Lombok코드 복사 후 pom.xml에 <dependencies></dependencies>사이에 붙어 넣기, 새로 고침
// ctrl + alt + s에서 Lombok 플러그인 다운

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @EqualsAndHashCode @ToString
@Data
public class Teacher {
    private String name;
    private int age;
}
