package com.ulrica.designpattern.creational.singleton;

/**
 * 懒汉模式
 */
public class Lazysingleton {

    //私有构造方法
    private Lazysingleton() {
    }

    private static Lazysingleton lazysingleton = null;

    public synchronized static Lazysingleton getInstance() {
        if (lazysingleton == null) {
            lazysingleton = new Lazysingleton();
        }
        return lazysingleton;
    }
}
