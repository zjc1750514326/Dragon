package com.zjc.orderserver.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjc
 * @Description: 商品订单类
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/22 22:27
 */
@Data
public class ProductOrder implements Serializable {

    private int id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 订单号
     */
    private  String tradeNo;

    /**
     * 价格,分
     */
    private int price;


    private Date createTime;


    private int userId;

    private String userName;
}
