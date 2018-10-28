package com.ulrica.designprinciple.dependenceinversion;

import lombok.Setter;

/**
 * 购买方法，底层依赖类
 */
@Setter
public class Buy {

    private Item item;

    public void buy() {
        this.item.buy();
    }

}
