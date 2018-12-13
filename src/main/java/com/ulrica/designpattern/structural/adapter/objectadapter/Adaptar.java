package com.ulrica.designpattern.structural.adapter.objectadapter;

/***
 *适配器
 *@author 180255
 *@creat 2018-12-13-9:28
 */
public class Adaptar implements Target{

    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();
    }
}
