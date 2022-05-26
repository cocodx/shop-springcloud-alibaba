package com.liugang.alibabacloud.service.impl;

import com.liugang.alibabacloud.bean.Product;
import com.liugang.alibabacloud.mapper.ProductMapper;
import com.liugang.alibabacloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public Product getProductById(Long pid) {
        return productMapper.selectById(pid);
    }

    @Override
    public int updateProductStockById(Integer count, Long id) {
        return productMapper.updateProductStockById(count,id);
    }
}
