package com.ulrica.designpattern.structural.decorator.v2;

/***
 *煎饼实体
 *@author 180255
 *@creat 2018-12-12-8:38
 */
public class BatterCake extends ABatterCake{

    @Override
    public String getDesc() {
        return "一个煎饼";
    }
    @Override
    public int cost() {
        return 8;
    }
}
