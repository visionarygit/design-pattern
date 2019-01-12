package com.ulrica.designpattern.behavioral.visitor;

/***
 *A部分公园
 *@author 180255
 *@creat 2019-01-12-8:48
 */
public class ParkA implements ParkElement {
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
