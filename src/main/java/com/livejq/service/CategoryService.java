package com.livejq.service;

import com.livejq.dao.ProductCategory;

import java.util.List;

/**
 * 描述:
 * 商品类目服务
 * Created by livejq
 * 2019-06-07 18:31
 **/
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
