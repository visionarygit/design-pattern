package com.ulrica.designpattern.behavioral.visitor;

/***
 *清洁工A
 *@author 180255
 *@creat 2019-01-12-8:55
 */
public class VistorA implements Vistor {
    public void visit(Park park) {

    }

    public void visit(ParkB parkB) {

    }

    public void visit(ParkA parkA) {
        System.out.println("清洁工A:完成A区域的清洁工作");
    }
}
