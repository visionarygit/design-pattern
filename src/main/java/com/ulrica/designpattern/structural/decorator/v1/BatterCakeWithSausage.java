package com.ulrica.designpattern.structural.decorator.v1;

import lombok.Data;

/***
 *带香肠的煎饼
 *@author 180255
 *@creat 2018-12-12-8:29
 */
public class BatterCakeWithSausage extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
