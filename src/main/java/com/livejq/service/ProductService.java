package com.livejq.service;

import com.livejq.dao.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 描述:
 * 商品服务
 * Created by livejq
 * 2019-06-07 22:28
 **/
public interface ProductService {
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
//    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
//    void decreaseStock(List<CartDTO> cartDTOList);

    //上架
//    ProductInfo onSale(String productId);

    //下架
//    ProductInfo offSale(String productId);
}
