package com.yh.service;

import com.yh.mapper.OrderMapper;
import com.yh.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    public List<Order> findAll() {
        return orderMapper.findAll();
    }
}
