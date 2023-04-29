package com.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class itemDto {

    private Long id; // 상품 코드
    private String itemNm; // 상품 이름
    private int price; // 가격
    private String itemDetail; // 상품 상세 설명
    private String sellStatCd; // 상품 판매 상태
    private LocalDateTime regTime; // 등록 시간
    private LocalDateTime updateTime; // 수정 시간

}
