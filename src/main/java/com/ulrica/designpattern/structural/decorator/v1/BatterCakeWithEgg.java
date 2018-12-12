package com.ulrica.designpattern.structural.decorator.v1;

import lombok.Data;

/***
 *带鸡蛋的煎饼
 *@author 180255
 *@creat 2018-12-12-8:27
 */
@Data
public class BatterCakeWithEgg extends BatterCake {

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
