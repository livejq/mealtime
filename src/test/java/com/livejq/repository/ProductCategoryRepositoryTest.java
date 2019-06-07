package com.livejq.repository;

import com.livejq.dao.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = repository.findOne(1);
        productCategory.setCategoryName("最新热卖");
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        System.out.println(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("女生最爱", 5);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);

//      Assert.assertNotEquals(null, result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2, 4, 5);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
        for(ProductCategory p : result) {
            System.out.println(p.toString());
        }
    }
}