package com.zjc.eurekafeignclient.service;

import com.zjc.eurekafeignclient.feignInterface.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/17 20:50
 */
@Service
public class HiService {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public  String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
