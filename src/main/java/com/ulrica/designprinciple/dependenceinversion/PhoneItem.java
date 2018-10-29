package com.ulrica.designprinciple.dependenceinversion;

/**
 * 手机商品
 */
public class PhoneItem implements Item {
    public void buy() {
        System.out.println("You buy a phone!");
    }
}
