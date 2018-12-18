package com.ulrica.designpattern.behavioral.templatemethod;

/***
 *做鸭
 *@author 180255
 *@creat 2018-12-18-9:21
 */
public class DuckCook extends ACook {

    private boolean ifPackage;

    @Override
    void cook() {
        System.out.println("铁锅炖");
    }

    public DuckCook(boolean ifPackage) {
        this.ifPackage = ifPackage;
    }

    @Override
    protected boolean ifPackage() {
        return this.ifPackage;
    }
}
