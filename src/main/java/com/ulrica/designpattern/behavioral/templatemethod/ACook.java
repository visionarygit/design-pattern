package com.ulrica.designpattern.behavioral.templatemethod;

/***
 *做菜抽象方法
 *@author 180255
 *@creat 2018-12-18-9:12
 */
public abstract class ACook {

    final void prepare() {
        System.out.println("准备食材");
    }

     protected final void make(){
        prepare();
        cook();
        if (ifPackage()) {
            packageFood();
        }
     }

    final void packageFood() {
        System.out.println("打包");
    }

    //钩子方法，是否打包
    protected boolean ifPackage() {
        return false;
    }

    abstract void cook();
}
