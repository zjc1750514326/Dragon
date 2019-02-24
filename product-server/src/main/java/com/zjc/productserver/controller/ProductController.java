package com.zjc.productserver.controller;

import com.zjc.productserver.model.Product;
import com.zjc.productserver.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zjc
 * @Description
 * @weixin ZJC1750514326
 * @email zhangjinchengl@outlook.com
 * @date 2019/2/22 22:04
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private String port;

    @GetMapping("find")
    public Product find(@RequestParam("id") int id){

        Product product = productService.find(id);

        Product result = new Product();
        BeanUtils.copyProperties(product,result);
        result.setName(result.getName()+" data from port: "+port);

        return result;
    }

    @RequestMapping("findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }
}
