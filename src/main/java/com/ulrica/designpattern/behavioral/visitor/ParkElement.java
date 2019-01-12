package com.ulrica.designpattern.behavioral.visitor;

/***
 *公园元素的抽象类
 *@author 180255
 *@creat 2019-01-12-8:47
 */
public interface ParkElement {

    /**
     * 用来接纳访问者
     */
    public void accept(Vistor vistor);
}
