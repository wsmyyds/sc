package com.example.commoditymall8001.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: sc
 * @description:
 * @author:
 * @create:
 **/
@Data
@TableName("goods")
public class GoodsVO {

    @TableId
    private int id_goods;
    private String name_goods;
    private String info_goods;
    private BigDecimal price_origin;
    private BigDecimal price_current;
    private String imgshow_url_goods;
    private String imginfo_url_goods;
    private Byte state_goods;
}
