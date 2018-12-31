package com.ulrica.designpattern.structural.proxy.staticproxy;

import com.ulrica.designpattern.structural.proxy.Order;
import com.ulrica.designpattern.structural.proxy.OrderService;
import com.ulrica.designpattern.structural.proxy.OrderServiceImpl;

/***
 *订单服务静态代理类
 *@author 180255
 *@creat 2018-12-31-14:32
 */
public class OrderServiceStaticProxy {

    private OrderService orderService;

    /**
     * 通过代理使方法增强
     * @param order
     * @return
     */
    int saveOrder(Order order) {
        before();
        orderService = new OrderServiceImpl();
        int res = orderService.saveOrder(order);
        after();
        return res;
    }

    private void before() {
        System.out.println("方法执行之前...");
    }

    private void after() {
        System.out.println("方法执行之后....");
    }
}
