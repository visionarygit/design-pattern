package com.ulrica.designpattern.structural.proxy;

/***
 *订单服务实现类
 *@author 180255
 *@creat 2018-12-31-14:29
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    public int saveOrder(Order order) {
        orderDao = new OrderDao();
        System.out.println("注入dao");
        return orderDao.saveOrder(order);
    }
}
