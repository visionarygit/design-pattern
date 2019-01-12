package com.ulrica.designpattern.behavioral.visitor;

/***
 *访问者
 *@author 180255
 *@creat 2019-01-12-8:51
 */
public interface Vistor {

    void visit(Park park);

    void visit(ParkB parkB);

    void visit(ParkA parkA);
}
