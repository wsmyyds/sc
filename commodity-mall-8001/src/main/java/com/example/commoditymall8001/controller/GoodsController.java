package com.example.commoditymall8001.controller;

import com.example.commoditymall8001.domain.GoodsDetailVO;
import com.example.commoditymall8001.domain.GoodsVO;
import com.example.commoditymall8001.service.GoodsService;
import com.example.commoditymall8001.util.Result;
import com.example.commoditymall8001.util.ResultGenerate;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@RestController
public class GoodsController {

    @Autowired
    GoodsService service;

    @RequestMapping("/goodsdetail/{id}")
    public Result getGoodDetailsById(@PathVariable("id") int id){

        System.out.println(service.getGoodDetailsById(id));
        GoodsDetailVO goodsDetailVO = new GoodsDetailVO();
        GoodsVO goodsVO = service.getGoodDetailsById(id);
        BeanUtils.copyProperties(goodsVO,goodsDetailVO);
        goodsDetailVO.setGoodsCarouselList(goodsVO.getImgshow_url_goods().split(","));
        return ResultGenerate.genSuccessResult(goodsDetailVO);
    }

}
