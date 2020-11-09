package io.seata.sample.service;

import java.math.BigDecimal;

import io.seata.sample.entity.Order;

/**
 * @author IT云清
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    void create(Order order);

    /**
     * 修改订单状态
     * @param userId
     * @param money
     * @param status
     */
    void update(Long userId,BigDecimal money,Integer status);
}
