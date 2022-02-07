package com.example.commoditymall8001.service;

import com.example.commoditymall8001.domain.GoodsVO;
import com.example.commoditymall8001.mapper.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Service
public class HomeService {

    @Autowired
    HomeMapper homeMapper;

    public List<GoodsVO> getNewGoods() {

        System.out.println(homeMapper.selectNewGoods());
        return homeMapper.selectNewGoods();
    }

    public List<GoodsVO> getHotGoods() {

        return homeMapper.selectHotGoods();
    }

    public List<GoodsVO> selectRecommendGoods(){

        return homeMapper.selectRecommendGoods();
    }


}
