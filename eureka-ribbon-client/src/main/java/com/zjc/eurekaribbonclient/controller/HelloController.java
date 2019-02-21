package com.zjc.eurekaribbonclient.controller;

import com.zjc.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/17 19:56
 */
@Controller
public class HelloController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("hi")
    @ResponseBody
    public String hi(@RequestParam(required = false,defaultValue = "zjc") String name){

        return ribbonService.hi(name);
    }
}
