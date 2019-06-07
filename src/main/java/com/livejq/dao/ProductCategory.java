package com.livejq.dao;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 描述:
 * 商品类目
 *
 * @author livejq
 * @create 2019-06-05 23:07
 **/
@Entity
@Data
@DynamicUpdate
public class ProductCategory {

    /**
     * 类目id.
     */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
