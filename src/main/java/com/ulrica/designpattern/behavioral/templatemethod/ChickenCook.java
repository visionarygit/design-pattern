package com.ulrica.designpattern.behavioral.templatemethod;

/***
 *做鸡
 *@author 180255
 *@creat 2018-12-18-9:16
 */
public class ChickenCook extends ACook {

    private boolean ifPackage;

    @Override
    protected void cook() {
        System.out.println("洗鸡");
        System.out.println("切鸡");
        System.out.println("炖鸡");
    }

    public ChickenCook(boolean ifPackage) {
        this.ifPackage = ifPackage;
    }

    @Override
    protected boolean ifPackage() {
        return this.ifPackage;
    }
}
