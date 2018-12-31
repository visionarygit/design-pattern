package com.ulrica.designpattern.structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 *订单服务动态代理
 *@author 180255
 *@creat 2018-12-31-14:51
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(target, args);
        after();
        return o;
    }

    private void before() {
        System.out.println("执行之前.....");
    }

    private void after() {
        System.out.println("执行之后。。。。。");
    }
}
