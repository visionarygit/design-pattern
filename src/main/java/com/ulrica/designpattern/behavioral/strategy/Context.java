package com.ulrica.designpattern.behavioral.strategy;

/***
 *策略容器
 *@author 180255
 *@creat 2019-01-10-9:54
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double cost(Double num) {
        return strategy.cost(num);
    }
}
