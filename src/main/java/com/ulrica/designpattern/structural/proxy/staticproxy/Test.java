package com.ulrica.designpattern.structural.proxy.staticproxy;

import com.ulrica.designpattern.structural.proxy.Order;

/***
 *
 *@author 180255
 *@creat 2018-12-31-14:36
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderNo("12312");
        order.setQuantity("121");

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
