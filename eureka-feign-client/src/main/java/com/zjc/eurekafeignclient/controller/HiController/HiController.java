package com.zjc.eurekafeignclient.controller.HiController;

import com.zjc.eurekafeignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/17 20:51
 */
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    /**
     * Feign 调用方法
     * @param name 参数名称
     * @return
     */
    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "zjc",required = false)String name){
        return hiService.sayHi(name);
    }
}
