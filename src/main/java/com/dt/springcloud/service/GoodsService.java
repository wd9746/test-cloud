package com.dt.springcloud.service;

import com.dt.springcloud.pojo.Goods;

/**
 * @ProjectName: springcloud2020_01
 * @ClassName: GoodsService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: WD
 * @Date: 2020/6/2 21:20
 */
public interface GoodsService {

    public Goods findGoodsById(int id);
}
