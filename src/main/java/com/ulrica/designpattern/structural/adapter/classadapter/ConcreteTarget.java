package com.ulrica.designpattern.structural.adapter.classadapter;

/***
 *目标接口具体实现
 *@author 180255
 *@creat 2018-12-13-9:20
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("目标接口方法");
    }
}
