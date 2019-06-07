package com.livejq.repository;

import com.livejq.dao.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 描述:
 * <p>
 * Created by livejq
 * 2019-06-05 23:17
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
