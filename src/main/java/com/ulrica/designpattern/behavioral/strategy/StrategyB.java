package com.ulrica.designpattern.behavioral.strategy;

/***
 *策略实现B
 *@author 180255
 *@creat 2019-01-10-9:54
 */
public class StrategyB implements Strategy {

    public double cost(Double num) {
        return num * 0.5;
    }
}
