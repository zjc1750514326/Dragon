package com.zjc.eurekaribbonclient.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/17 19:43
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced  // 此时RestTemplate就结合了Ribbon开启了负载均衡功能。
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
