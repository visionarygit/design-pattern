package com.ulrica.designpattern.behavioral.cor;

/***
 *组装车尾
 *@author 180255
 *@creat 2019-01-17-10:28
 */
public class CarTailHandler extends CarHandler{
    @Override
    public void handler() {
        System.out.println("组装车尾");
        if (this.carHandler != null) {
            this.carHandler.handler();
        }
    }
}
