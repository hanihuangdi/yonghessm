package com.yh.controller;

import com.yh.pojo.Door;
import com.yh.pojo.Order;
import com.yh.service.DoorSerivce;
import com.yh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    DoorSerivce doorSerivce;
    /*
     * @Description:查询所有订单
     * @Author:hcf
     * @Date: 2019/12/16 21:01
     * @param: []
     * @return: java.util.List<com.yh.pojo.Order>
     */
    @RequestMapping("/findOrderList")
    public String findAll(Model model){
        List<Order> orders = orderService.findAll();
        model.addAttribute("orders",orders);
        //3.查询所有门店
        List<Door> doorlist = doorSerivce.findAll();
        //4.将所有订单的list集合存入Model中(存入request域中)
        model.addAttribute("doorList", doorlist);
        return "order_list";
    }
}
