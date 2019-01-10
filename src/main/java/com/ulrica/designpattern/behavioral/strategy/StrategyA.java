package com.ulrica.designpattern.behavioral.strategy;

/***
 *策略实现A
 *@author 180255
 *@creat 2019-01-10-9:53
 */
public class StrategyA implements Strategy {

    public double cost(Double num) {
        return num * 0.8;
    }
}
