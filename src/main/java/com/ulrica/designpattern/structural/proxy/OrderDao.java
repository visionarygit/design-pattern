package com.ulrica.designpattern.structural.proxy;

/***
 *订单持久化服务
 *@author 180255
 *@creat 2018-12-31-14:30
 */
public class OrderDao {

    int saveOrder(Order order) {
        System.out.println("插入订单数据库");
        return 0;
    }
}
