package com.livejq.repository;

import com.livejq.dao.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 描述:
 * <p>
 * Created by livejq
 * 2019-06-07 22:07
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
