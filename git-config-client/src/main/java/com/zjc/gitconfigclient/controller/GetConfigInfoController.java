package com.zjc.gitconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjc
 * @Description: 获取git配置信息
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/18 21:22
 */
@RestController
@RefreshScope  // 读readme.txt 给加载变量的类上面加载@RefreshScope，在客户端执行/actuator/refresh的时候就会更新此类下面的变量值。
public class GetConfigInfoController {

    @Value("${content}")
    private String content;

    @Value("${server.port}")
    private String port;

    @GetMapping("getInfo")
    public String getInfo(){

        return "content : "+content+" , port: "+port;
    }
}
