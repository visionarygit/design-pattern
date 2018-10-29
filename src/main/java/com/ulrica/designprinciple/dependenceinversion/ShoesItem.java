package com.ulrica.designprinciple.dependenceinversion;

/**
 * 鞋子商品
 */
public class ShoesItem implements Item {

    public void buy() {
        System.out.println("You buy a shoes!");
    }
}
