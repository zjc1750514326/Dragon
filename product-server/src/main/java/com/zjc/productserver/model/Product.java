package com.zjc.productserver.model;

import lombok.Data;

/**
 * @author zjc
 * @Description: 商品名称
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/22 21:54
 */
@Data
public class Product {

    public  Product(){ }

    public  Product(int id, String name, int price, int store){
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 价格,分为单位
     */
    private int price;

    /**
     * 库存
     */
    private int store;
}
