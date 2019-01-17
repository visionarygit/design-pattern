package com.ulrica.designpattern.behavioral.cor;

/***
 *组装车头
 *@author 180255
 *@creat 2019-01-17-10:24
 */
public class CarHeadHandler extends CarHandler {

    @Override
    public void handler() {
        System.out.println("组装车头");
        if (this.carHandler != null) {
            this.carHandler.handler();
        }
    }
}
