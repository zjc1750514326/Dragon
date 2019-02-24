package com.zjc.orderserver.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zjc.orderserver.service.ProductOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/22 22:32
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/productOrder")
public class OrderController {

    @Autowired
    private ProductOrderService productOrderService;

    @RequestMapping("save")
    @HystrixCommand(fallbackMethod = "saveOrderFail")
    public Object save(@RequestParam("user_id")int userId, @RequestParam("product_id") int productId){
//        return productOrderService.save(userId,productId);
        HashMap<String, String> data = new HashMap<>();
        String result = productOrderService.find(userId, productId);
        data.put("code", "0");
        data.put("data", result);
        return data;
    }

    /**
     * 注意方法签名一定要和API一致
     * @param userId
     * @param productId
     * @return
     */
    public Object saveOrderFail(int userId,int productId){
        HashMap<String, String> data = new HashMap<>();
        data.put("code", "-1");
        data.put("data", "抢购人数太多,您被挤出来了,请稍后重试!");
        return data;
    }

}
