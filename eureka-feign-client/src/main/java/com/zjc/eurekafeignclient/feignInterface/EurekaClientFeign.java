package com.zjc.eurekafeignclient.feignInterface;

import com.zjc.eurekafeignclient.configuration.FeignConfig;
import com.zjc.eurekafeignclient.hystrix.HiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/17 20:39
 */
@Component
// 指定这个接口所要调用的服务名称， fallback 熔断降级
@FeignClient(value = "eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {

    /**
     * 使用 Spring MVC 的注解就可以来绑定服务提供方的 REST 接口，
     * 比如下面就是绑定 eureka-client 服务的/hi/接口的例子
     * @param name
     * @return
     */
    @GetMapping(value = "hi")
    String sayHiFromClientEureka(@RequestParam(value = "name")String name);
}
