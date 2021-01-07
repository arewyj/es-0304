package com.baidu.shop.service;

import com.alibaba.fastjson.JSONObject;
import com.baidu.shop.base.Result;
import com.baidu.shop.dto.SpuDTO;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "商品接口")
public interface GoodsService {

    @ApiOperation(value = "获取商品信息")
    @GetMapping(value = "goods/getSpuInfo")
    Result<PageInfo<SpuDTO>>  getSpuInfo(SpuDTO spuDTO);

    @ApiOperation(value = "新增商品信息")
    @PostMapping(value = "goods/save")
    Result<JSONObject> saveGoods(@RequestBody SpuDTO spuDTO);
}