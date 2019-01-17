package com.ulrica.designpattern.behavioral.cor;

/***
 *汽车组装
 *@author 180255
 *@creat 2019-01-17-10:21
 */
public abstract class CarHandler {

    /**
     * 下一职责 .
     **/
    protected CarHandler carHandler;

    public CarHandler nextHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return this.carHandler;
    }

    public abstract void handler();
}
