package com.back.domain.wiseSaying.wiseSaying.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity //데이터베이스 테이블과 매핑되는 객체
@Getter
@NoArgsConstructor  //JPA는 데이터베이스에서 데이터를 읽어와 객체를 생성할 때 기본 생성자를 필요
public class WiseSaying {
    @Id //Primary Key 지정
    @GeneratedValue(strategy = IDENTITY)    //AUTO_INCREMENT
    private int id;
    private String content;
    private String author;

    public WiseSaying(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public void modify(String content, String author) {
        this.content = content;
        this.author = author;
    }
}