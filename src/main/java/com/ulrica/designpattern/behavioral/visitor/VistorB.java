package com.ulrica.designpattern.behavioral.visitor;

/***
 *清洁工B
 *@author 180255
 *@creat 2019-01-12-8:56
 */
public class VistorB implements Vistor {
    public void visit(Park park) {

    }

    public void visit(ParkB parkB) {
        System.out.println("清洁工B:完成B区域的清洁工作");
    }

    public void visit(ParkA parkA) {

    }
}
