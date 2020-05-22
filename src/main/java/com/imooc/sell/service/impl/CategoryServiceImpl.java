package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import com.imooc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @Title: CategoryServiceImpl
* @Package com.imooc.sell.service.impl
* @Description: 类目
* @author:boy
* @date 2020/4/15
* @version V1.0
*/
@Component
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepository repository;

    @Override
    public ProductCategory findOne (Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll () {

        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn (List<Integer> categoryTypeList) {

        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save (ProductCategory productCategory) {

        return repository.save(productCategory);
    }
}
