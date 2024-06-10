package com.study.java_study.ch17_컬랙션;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

// VO, Entity
// DTO(Data Transfer Object) : 데이터 전송 객체
@AllArgsConstructor
@Data
public class BookRequestDto {
    private int status;
    private String message;
    private List<BookEntity> bookEntities;
}
