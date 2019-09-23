package com.ulrica.designpattern.creational.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * 基于容器实现单例
 * @author: 180255
 * @time: 2019/9/23
 */
public class ContainerSingleton {

    //私有构造方法
    private ContainerSingleton() {}

    //定义容器
    private static final Map<String, Object> sinlgetonContainer = new HashMap<String, Object>();

    //将实例加入容器
    public static void putInstance(String name, Object o) {
        if (!sinlgetonContainer.containsKey(name)) {
            sinlgetonContainer.put(name, o);
        }
    }

    //获取实例
    public static Object getInstance(String name) {
        return sinlgetonContainer.get(name);
    }
}
