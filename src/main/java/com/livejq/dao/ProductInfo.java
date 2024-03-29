package com.livejq.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 描述:
 * 商品信息
 * Created by livejq
 * 2019-06-07 21:57
 **/
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态, 0正常1下架. */
    private Integer productStatus;
//    = ProductStatusEnum.UP.getCode();

    /** 类目编号. */
    private Integer categoryType;

//    @JsonIgnore
//    public ProductStatusEnum getProductStatusEnum() {
//        return EnumUtil.getByCode(productStatus, ProductStatusEnum.class);
//    }
}
