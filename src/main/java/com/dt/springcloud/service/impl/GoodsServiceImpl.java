package com.dt.springcloud.service.impl;

import ch.qos.logback.core.util.TimeUtil;
import com.dt.springcloud.pojo.Goods;
import com.dt.springcloud.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: springcloud2020_01
 * @ClassName: GoodsServiceImpl
 * @Description: TODO(一句话描述该类的功能)
 * @Author: WD
 * @Date: 2020/6/2 21:20
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    private final Logger logger= LoggerFactory.getLogger(getClass());

    private static final Map<Integer, Goods> map = new HashMap<>();

    @Value("${server.port}")
    private String serverPort;

    static {
        map.put(1, new Goods(1, "手机", 1234.22));
        map.put(2, new Goods(2, "自行车", 222.88));
        map.put(3, new Goods(3, "笔记本", 5888.5));
    }

    @Override
    public Goods findGoodsById(int id) {
        logger.info("商品订单正在服务中");
        Goods goods = map.get(id);
        goods.setServerPort(serverPort);
        return map.get(id);
    }
}
