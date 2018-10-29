package com.ulrica.designprinciple.singleresponesibility;

/**
 * 将item类拆成ItemInfo和ItemManage
 */
public interface ItemInfo {

    /**
     * 获取商品名称
     * @return
     */
    String getItemName ();

    /**
     * 获取商品价格
     * @return
     */
    Double getItemPrice ();
}
