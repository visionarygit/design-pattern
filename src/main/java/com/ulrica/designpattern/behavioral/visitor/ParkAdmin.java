package com.ulrica.designpattern.behavioral.visitor;

/***
 *公园管理员
 *@author 180255
 *@creat 2019-01-12-8:57
 */
public class ParkAdmin implements Vistor {
    public void visit(Park park) {
        System.out.println("公园管理员：检查整个公园的情况");
    }

    public void visit(ParkB parkB) {
        System.out.println("公园管理员：检查B区域的卫生情况");
    }

    public void visit(ParkA parkA) {
        System.out.println("公园管理员：检查A区域的卫生情况");
    }
}
