package com.ulrica.designpattern.behavioral.visitor;

/***
 *公园(对象结构角色)
 *@author 180255
 *@creat 2019-01-12-8:50
 */
public class Park implements ParkElement{

    private ParkA parkA;

    private ParkB parkB;

    public Park() {
        this.parkA = new ParkA();
        this.parkB = new ParkB();
    }

    public void accept(Vistor vistor) {
        vistor.visit(this);
        parkA.accept(vistor);
        parkB.accept(vistor);
    }
}
