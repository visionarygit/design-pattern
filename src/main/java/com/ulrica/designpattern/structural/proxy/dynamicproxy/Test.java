package com.ulrica.designpattern.structural.proxy.dynamicproxy;

import com.ulrica.designpattern.structural.proxy.*;

/***
 *动态代理测试类
 *@author 180255
 *@creat 2018-12-31-14:59
 */
public class Test {
    public static void main(String[] args) {

        Order order = new Order();
        order.setOrderNo("12312");
        order.setQuantity("121");


        OrderServiceDynamicProxy orderServiceDynamicProxy = new OrderServiceDynamicProxy(new OrderServiceImpl());
        OrderService orderService = (OrderService) orderServiceDynamicProxy.bind();
        orderService.saveOrder(order);

        OrderServiceDynamicProxy orderServiceDynamicProxy1 = new OrderServiceDynamicProxy(new StockServiceImpl());
        StockService stockService = (StockService) orderServiceDynamicProxy1.bind();
        stockService.reduceStock(order);
    }
}
