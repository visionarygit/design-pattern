package com.ulrica.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * 饿汉模式
 */
public class HungrySingleton implements Serializable {

    private HungrySingleton(){}

    private static HungrySingleton hungrySingleton = null;

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

    //增加readResolve方法防止此单例在进行序列化和反序列化（readObject）时产生新的实例   序列化破坏单例模式解决方案
    private HungrySingleton readResolve() {
        return hungrySingleton;
    }
}
