package com.liugang.alibabacloud.controller;

import com.alibaba.fastjson.JSON;
import com.liugang.alibabacloud.bean.Product;
import com.liugang.alibabacloud.constants.HttpCode;
import com.liugang.alibabacloud.resp.Result;
import com.liugang.alibabacloud.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/get/{pid}")
    public Product getProduct(@PathVariable("pid") Long pid){
        Product product = productService.getProductById(pid);
        log.info("获取到的商品信息为：{}", JSON.toJSONString(product));
        return product;
    }

    @GetMapping("/update_count/{pid}/{count}")
    public Result<Integer> updateCount(@PathVariable("pid") Long pid,@PathVariable("count")Integer count){
        log.info("更新商品库存传递参数为：商品id：{}，购买数量：{}",pid,count);
        int updateCount = productService.updateProductStockById(count,pid);
        Result<Integer> result = new Result<>(HttpCode.SUCCESS,"执行成功",updateCount);
        return result;
    }
}
