package com.dt.springcloud.controller;

import com.dt.springcloud.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springcloud2020_01
 * @ClassName: GoodsController
 * @Description: TODO(一句话描述该类的功能)
 * @Author: WD
 * @Date: 2020/6/2 21:25
 */
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/goods")
    public Object findGoodsById(int id) {
        return goodsService.findGoodsById(id);
    }
}
