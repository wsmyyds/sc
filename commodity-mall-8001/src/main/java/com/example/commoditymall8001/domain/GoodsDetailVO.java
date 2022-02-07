package com.example.commoditymall8001.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: sc
 * @description: 商品详情
 * @author:
 * @create:
 **/
@Data
public class GoodsDetailVO {

    @TableId
    private int id_goods;
    private String name_goods;
    private String info_goods;
    private BigDecimal price_origin;
    private BigDecimal price_current;
    //顶部展示图片
    private String[] goodsCarouselList;
    //商品详细介绍图片
    private String imginfo_url_goods;
    private Byte state_goods;
}
