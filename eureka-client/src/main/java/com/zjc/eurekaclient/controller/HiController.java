package com.zjc.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static sun.misc.PostVMInitHook.run;

/**
 * @author zjc
 * @Description: 提供服务接口
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/17 19:35
 */
@Controller
public class HiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    @ResponseBody
    public String Home(@RequestParam String name){

        return "hi "+name+",i am from port:"+port;
    }
}
