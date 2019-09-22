package com.ulrica.designpattern.creational.singleton.lazy;

/**
 * 加锁懒汉
 * 优点：解决线程安全问题
 * 缺点：存在性能问题
 */
public class LazyLockSingleton {

    private static LazyLockSingleton lazyLockSingleton = null;

    private LazyLockSingleton() {

    }

    public synchronized static LazyLockSingleton getInstance() {
        if (lazyLockSingleton == null) {
            lazyLockSingleton = new LazyLockSingleton();
        }

        return lazyLockSingleton;
    }

}
