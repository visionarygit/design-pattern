package com.ulrica.designprinciple.singleresponesibility;

/**
 * 定义：不要存在多于一个导致类变更到原因
 * 核心: 一个类/接口/方法只负责一个职责
 * 优点：降低类的复杂度，提高类的可读性，提高系统到可维护性，降低变更引起到风险
 */
public class Test {
    public static void main(String[] args) {
        //获取商品名称
        ItemInfo itemInfo = new ItemImpl();
        itemInfo.getItemName();

        //购买商品
        ItemManage itemManage = new ItemImpl();
        itemManage.buyItem();
    }
}
