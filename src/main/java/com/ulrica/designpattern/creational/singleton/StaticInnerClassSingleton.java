package com.ulrica.designpattern.creational.singleton;

/**
 * 基于静态内部类的单例创建 （class对象的初始化锁）
 */
public class StaticInnerClassSingleton {

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }
}
