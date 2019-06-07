package com.livejq.enums;

import lombok.Getter;

/**
 * 描述:
 * 商品状态
 * Created by livejq
 * 2019-06-07 22:40
 **/
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
