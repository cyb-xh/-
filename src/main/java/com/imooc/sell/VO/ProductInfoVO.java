package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
* @Title: ProductInfoVO
* @Package com.imooc.sell.VO
* @Description: 商品详情
* @date 2020/4/15
* @version V1.0
*/
@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("icon")
    private String productIcon;

}
