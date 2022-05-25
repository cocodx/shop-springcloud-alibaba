package com.liugang.alibabacloud.bean;

import com.baomidou.mybatisplus.annotation.*;
import com.liugang.alibabacloud.id.SnowFlakeFactory;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单明细
 */
@Data
@TableName("t_order_item")
public class OrderItem {

    private static final long serialVersionUID = -1329173923755780293L;

    /**
     * 数据id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @TableField(value = "id", fill = FieldFill.INSERT)
    private Long id;

    @TableField("t_order_id")
    private Long orderId;

    /**
     * 商品id
     */
    @TableField("t_pro_id")
    private Long proId;

    /**
     * 商品名称
     */
    @TableField("t_pro_name")
    private String proName;

    /**
     * 商品价格（单价）
     */
    @TableField("t_pro_price")
    private BigDecimal proPrice;

    /**
     * 购买数量
     */
    @TableField("t_number")
    private Integer number;

    public OrderItem(){
        this.id = SnowFlakeFactory.getSnowFlakeFromCache().nextId();
    }
}
