package com.ulrica.designpattern.behavioral.visitor;

/***
 *B部分公园
 *@author 180255
 *@creat 2019-01-12-8:48
 */
public class ParkB implements ParkElement{
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
