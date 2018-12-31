package com.ulrica.designpattern.structural.proxy;

/***
 *库存服务实现类
 *@author 180255
 *@creat 2018-12-31-15:03
 */
public class StockServiceImpl implements StockService {


    public void reduceStock(Order order) {
        System.out.println("扣除库存。。。。");
    }
}
