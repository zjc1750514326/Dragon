package com.zjc.orderserver.configurate;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/22 22:25
 */
@Component
public class RibbonCinfig {

    @Bean
    @LoadBalanced  // 开启负载均衡
    public RestTemplate getRestTenplate(){
        return new RestTemplate();
    }
}
