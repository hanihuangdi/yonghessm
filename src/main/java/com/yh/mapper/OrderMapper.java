package com.yh.mapper;

import com.yh.pojo.Order;

import java.util.List;

public interface OrderMapper {
    /*
     * @Description:查询所有订单
     * @Author:hcf
     * @Date: 2019/12/16 21:00
     * @param: []
     * @return: java.util.List<com.yh.pojo.Order>
     */
    List<Order> findAll();
}
