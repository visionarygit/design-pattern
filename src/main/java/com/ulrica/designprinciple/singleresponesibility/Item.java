package com.ulrica.designprinciple.singleresponesibility;

/**
 * 不满足单一职责到商品服务
 */
public interface Item {

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

    /**
     * 购买商品
     */
    void buyItem();

    /**
     * 退货
     */
    void returnItem ();
}
