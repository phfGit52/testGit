package com.zzxy.sp01.service;

import com.zzxy.sp01.pojo.Item;

import java.util.List;

public interface ItemService {
    //根据订单id找商品
    List<Item> getItems(String orderId);
    //根据商品减少商品数量
    void decreaseNumbers(List<Item> list);
}
