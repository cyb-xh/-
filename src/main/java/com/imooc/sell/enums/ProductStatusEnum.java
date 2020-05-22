package com.imooc.sell.enums;

import lombok.Getter;

/**
* @Title: ProductStatusEnum
* @Package com.imooc.sell.enums
* @Description: 商品状态
* @author:boy
* @date 2020/4/15
* @version V1.0
*/
@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),
    DOWN(1,"下架");
    private  Integer code;

    private String message;
    ProductStatusEnum (Integer code,String message) {
        this.code = code;
        this.message=message;
    }
}
