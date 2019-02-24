package com.zjc.orderserver.service;

import com.zjc.orderserver.cilent.productClient.ProductClient;
import com.zjc.orderserver.model.ProductOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/22 22:29
 */
@Service
@Slf4j
public class ProductOrderService {

    /*@Autowired
    private RestTemplate restTemplate;*/

    @Autowired
    private ProductClient productClient;

    public Object save(int userId,int productId){

        /*Object object = restTemplate.getForObject("http://product-server/api/v1/product/find?id="+productId, Object.class);

        log.info(object.toString());

        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        productOrder.setProductName(jsonNode.get("name").toString());
        productOrder.setPrice(Integer.parseInt(jsonNode.get("price").toString()));
        */

        return null;//object;
    }

    public String find(int userId,int productId){

        return productClient.find(productId);
    }
}
