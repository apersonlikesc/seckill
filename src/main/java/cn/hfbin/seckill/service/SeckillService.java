package cn.hfbin.seckill.service;

import cn.hfbin.seckill.bo.GoodsBo;
import cn.hfbin.seckill.entity.Goods;
import cn.hfbin.seckill.entity.OrderInfo;
import cn.hfbin.seckill.entity.User;

/**
 * Created by: HuangFuBin
 * Date: 2018/7/16
 * Time: 14:10
 * Such description:
 */
public interface SeckillService {

    OrderInfo insert(User user , GoodsBo goodsBo);
}
