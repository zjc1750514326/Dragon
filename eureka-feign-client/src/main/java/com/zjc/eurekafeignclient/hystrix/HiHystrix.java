package com.zjc.eurekafeignclient.hystrix;

import com.zjc.eurekafeignclient.feignInterface.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @author zjc
 * @Description: 熔断降级处理类
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/18 18:52
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi , "+name+" , sorry.error ...";
    }
}
