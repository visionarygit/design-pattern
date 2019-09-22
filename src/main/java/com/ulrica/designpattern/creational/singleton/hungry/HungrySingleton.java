package com.ulrica.designpattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉模式
 */
public class HungrySingleton implements Serializable, Cloneable {

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

    //另一种破坏单例的途径为 clone 防止clone破坏有2中方法
    //1.不要实现cloneable接口
    //2.在clone实现方法内return getInstance()

    @Override
    public Object clone() throws CloneNotSupportedException {
        return getHungrySingleton();
    }
}
