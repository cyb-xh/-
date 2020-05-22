package com.imooc.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.sell.enums.CodeEnum;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.util.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@DynamicUpdate//动态修改更新时间
@EntityListeners(AuditingEntityListener.class)
public class ProductInfo  {
    @Id
    private String productId;

    //商品名称
    private String productName;

    //单价
    private BigDecimal productPrice;

    //库存
    private Integer productStock;

    //描述
    private String productDescription;

    //小图
    private String productIcon;

    //商品状态（0正常，1下架）
    private Integer productStatus= ProductStatusEnum.UP.getCode();;

    //类目编号
    private Integer categoryType;
    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
    }

}
