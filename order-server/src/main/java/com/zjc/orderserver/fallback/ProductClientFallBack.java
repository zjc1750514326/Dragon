package com.zjc.orderserver.fallback;

import com.zjc.orderserver.cilent.productClient.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author zjc
 * @Description: 针对商品服务熔断降级处理
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/24 15:52
 */
@Component
@Slf4j
public class ProductClientFallBack implements ProductClient {

    @Override
    public String find(int id) {

        log.info(" fegin 调用 product-server find 异常 ");
        return null;
    }
}
