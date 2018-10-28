package com.ulrica.designprinciple.singleresponesibility;
/**
 * 将item类拆成ItemInfo和ItemManage
 */
public interface ItemManage {

    /**
     * 购买商品
     */
    void buyItem();

    /**
     * 退货
     */
    void returnItem ();
}
