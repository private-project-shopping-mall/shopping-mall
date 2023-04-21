package com.shop.domain.constant;

public enum ItemSellStatus {
    SELL("판매중"),
    SOLD_OUT("매진");


    private final String status;

    ItemSellStatus(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }
}
