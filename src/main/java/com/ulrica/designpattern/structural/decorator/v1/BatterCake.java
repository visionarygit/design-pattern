package com.ulrica.designpattern.structural.decorator.v1;

import lombok.Data;

/***
 *煎饼类
 *@author 180255
 *@creat 2018-12-12-8:17
 */
public class BatterCake {

    public String getDesc() {
        return "一个煎饼";
    }

    public int cost() {
        return 8;
    }
}
