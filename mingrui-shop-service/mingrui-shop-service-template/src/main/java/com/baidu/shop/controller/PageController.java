package com.baidu.shop.controller;

import com.baidu.shop.feign.GoodsFeign;
import com.baidu.shop.service.GoodsService;
import com.baidu.shop.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ClassName PageController
 * @Description: TODO
 * @Author wyj
 * @Date 2021/3/8
 * @Version V1.0
 **/
//@Controller
//@RequestMapping(value = "item")
public class PageController {
    //@Autowired
    private PageService pageService;

    //@GetMapping(value = "{spuId}.html")
    public String test(@PathVariable(value = "spuId") Integer spuId, ModelMap modelMap){
        Map<String, Object> map = pageService.getGoodsInfo(spuId);
        modelMap.putAll(map);
        return "item";
    }
}
