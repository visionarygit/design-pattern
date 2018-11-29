package com.ulrica.designpattern.structural.facade;


/**
 * 外观模式：提供一个统一的接口用来访问子系统中的一群系统
 * 场景：下单逻辑
 */
public class Test {

    public static void main(String[] args) {
        BuyService buyService = new BuyService();
        buyService.buy(new Item("手机"));
    }
}
