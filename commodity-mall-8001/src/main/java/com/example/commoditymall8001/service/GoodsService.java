package com.example.commoditymall8001.service;

import com.example.commoditymall8001.domain.GoodsVO;
import com.example.commoditymall8001.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Service
public class GoodsService {

    @Autowired
    GoodsMapper mapper;

    public GoodsVO getGoodDetailsById(int id){

        return mapper.getGoodDetailsById(id);
    }

}
