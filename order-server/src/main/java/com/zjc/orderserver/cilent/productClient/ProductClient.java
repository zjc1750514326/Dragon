package com.zjc.orderserver.cilent.productClient;

import com.zjc.orderserver.fallback.ProductClientFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zjc
 * @Description: 商品服务客户端
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/23 20:41
 */
@FeignClient(name = "product-server",fallback = ProductClientFallBack.class)
@Component
public interface ProductClient {

    @RequestMapping("/api/v1/product/find")
    String find(@RequestParam("id") int id);
}
