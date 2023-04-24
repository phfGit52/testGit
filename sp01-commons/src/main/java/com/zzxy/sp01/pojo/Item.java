package com.zzxy.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private Integer id;//id
    private String name;//商品名
    private Integer number;//商品数量
}
