package com.liugang.alibabacloud.service;

import com.liugang.alibabacloud.bean.Product;

/**
 * 商品Service接口
 */
public interface ProductService {

    /**
     * 根据商品id获取商品信息
     * @param pid
     * @return
     */
    Product getProductById(Long pid);


    /**
     * 扣减商品库存
     * @return
     */
    int updateProductStockById(Integer count,Long id);
}
