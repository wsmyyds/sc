package com.example.commoditymall8001.controller;

import com.example.commoditymall8001.domain.IndexInfoVO;
import com.example.commoditymall8001.service.HomeService;
import com.example.commoditymall8001.util.Result;
import com.example.commoditymall8001.util.ResultGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    //http://localhost:8080/commodity/index-infos
    @RequestMapping("/index-infos")
    public Result getNewGoods(){


        IndexInfoVO indexInfoVO = new IndexInfoVO();
        indexInfoVO.setNewGoodses(homeService.getNewGoods());
        indexInfoVO.setHotGoodses(homeService.getHotGoods());
        indexInfoVO.setRecommendGoodses(homeService.selectRecommendGoods());

        Result res = ResultGenerate.genSuccessResult(indexInfoVO);
        return res;
    }
}
