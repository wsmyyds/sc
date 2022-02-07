package com.example.commoditymall8001.domain;

import lombok.Data;

import java.util.List;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Data
public class IndexInfoVO {

    /***"轮播图(列表)"*/
    //private List<NewBeeMallIndexCarouselVO> carousels;

    /***"首页热销商品(列表)"*/
    private List<GoodsVO> hotGoodses;

    /***"首页新品推荐(列表)"*/
    private List<GoodsVO> newGoodses;

    /***"首页推荐商品(列表)"*/
    private List<GoodsVO> recommendGoodses;
}
