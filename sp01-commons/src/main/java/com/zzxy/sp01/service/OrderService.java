package com.zzxy.sp01.service;

import com.zzxy.sp01.pojo.Order;

public interface OrderService {
    //根据订单id找订单
    Order getOrder(String orderId);
    //添加订单
    void addOrder(Order order);
}
