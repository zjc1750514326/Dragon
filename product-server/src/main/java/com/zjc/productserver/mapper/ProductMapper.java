package com.zjc.productserver.mapper;

import com.zjc.productserver.model.Product;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/22 21:58
 */
public interface ProductMapper {

    Product find(int id);
}
