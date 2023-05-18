package com.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;     //FK, Long ArticleId 대신 객체지향적 개념으로 게시글 ID가 아닌 게시글  / 게시글(ID)
    private String content;     //본문


    private LocalDateTime createdAt;    //생성일시
    private String createdBy;   //생성자
    private LocalDateTime modifiedAt;   //수정일시
    private String modifiedBy;  //수정자


}
