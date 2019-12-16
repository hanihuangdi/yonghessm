package com.yh.service;

import com.yh.pojo.Order;

import java.util.List;

public interface OrderService {
    /*
     * @Description:查询所有订单
     * @Author:hcf
     * @Date: 2019/12/16 21:01
     * @param: []
     * @return: java.util.List<com.yh.pojo.Order>
     */
    List<Order> findAll();
}
