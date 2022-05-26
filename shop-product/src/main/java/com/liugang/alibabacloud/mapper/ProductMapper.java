package com.liugang.alibabacloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liugang.alibabacloud.bean.Product;
import org.apache.ibatis.annotations.Param;

/**
 * 使用Mybatis-plus，集成BaseMapper接口。
 */
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * 扣减商品库存
     * @param count
     * @param id
     * @return
     */
    int updateProductStockById(@Param("count")Integer count,@Param("id")Long id);
}
