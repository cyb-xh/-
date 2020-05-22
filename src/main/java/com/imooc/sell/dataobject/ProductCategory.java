package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@DynamicUpdate//动态修改更新时间
@Data//生成get/set/toString()等方法
@EntityListeners(AuditingEntityListener.class)
public class ProductCategory {
    //类目id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private Integer categoryId;

    //类目名字
    private String categoryName;

    //类目编号
    private Integer categoryType;

    @CreatedDate
    private Date createTime;
    @LastModifiedDate
    private Date updateTime;

    public ProductCategory () {
    }

    public ProductCategory (String categoryName, Integer categoryType) {
        this.categoryName=categoryName;
        this.categoryType=categoryType;
    }
}
