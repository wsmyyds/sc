package com.example.commoditymall8001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.commoditymall8001.domain.GoodsVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Mapper
public interface GoodsMapper extends BaseMapper<GoodsVO> {

    GoodsVO getGoodDetailsById(int id);

}
