package com.ulrica.designpattern.behavioral.cor;

/***
 *组装车身
 *@author 180255
 *@creat 2019-01-17-10:27
 */
public class CarBodyHandler extends CarHandler {
    @Override
    public void handler() {
        System.out.println("组装车身");
        if (this.carHandler != null) {
            this.carHandler.handler();
        }
    }
}
