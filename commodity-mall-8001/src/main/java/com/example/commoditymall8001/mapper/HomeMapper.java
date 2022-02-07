package com.example.commoditymall8001.mapper;

import com.example.commoditymall8001.domain.GoodsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Mapper
public interface HomeMapper{

    /***/
    List<GoodsVO> selectNewGoods();

    List<GoodsVO> selectHotGoods();

    List<GoodsVO> selectRecommendGoods();
}
