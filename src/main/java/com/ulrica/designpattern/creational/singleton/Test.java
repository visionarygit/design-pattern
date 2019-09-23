package com.ulrica.designpattern.creational.singleton;

import com.ulrica.designpattern.creational.singleton.hungry.HungrySingleton;
import com.ulrica.designpattern.creational.singleton.lazy.StaticInnerClassSingleton;
import com.ulrica.designpattern.creational.singleton.register.ContainerSingleton;
import com.ulrica.designpattern.creational.singleton.register.EnumSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式
 * 定义：保证一个类只创建一次，并提供全局访问点
 * 优点：减少内存开销
 *      可以避免对资源的多重占用
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException, ClassNotFoundException, CloneNotSupportedException {
//        Class clazz = StaticInnerClassSingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton classSingleton1 = (StaticInnerClassSingleton) constructor.newInstance();
//        StaticInnerClassSingleton classSingleton2 = (StaticInnerClassSingleton) constructor.newInstance();
//        System.out.println(classSingleton1);
//        System.out.println(classSingleton2);
//        System.out.println(classSingleton1 == classSingleton2);

//        Class clazz1 = EnumSingleton.class;
//        Constructor constructor = clazz1.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        EnumSingleton enumSingleton1 = (EnumSingleton) constructor.newInstance("111", 111);
//        EnumSingleton enumSingleton2 = (EnumSingleton) constructor.newInstance("111", 111);
//        System.out.println(enumSingleton1);
//        System.out.println(enumSingleton2);
//
//        EnumSingleton enumSingleton = EnumSingleton.getInstance();
//        enumSingleton.test();


        //序列化破坏单例
//        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test"));
//        objectOutputStream.writeObject(hungrySingleton);
//
//        File file = new File("test");
//        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
//
//        HungrySingleton newHungrySingleton = (HungrySingleton) inputStream.readObject();
//
//        System.out.println(hungrySingleton);
//        System.out.println(newHungrySingleton);
//        System.out.println(newHungrySingleton == hungrySingleton);

        //克隆破坏单例
//        HungrySingleton hungrySingleton = HungrySingleton.getHungrySingleton();
//        HungrySingleton hungrySingleton1 = (HungrySingleton) hungrySingleton.clone();
//
//        System.out.println(hungrySingleton);
//        System.out.println(hungrySingleton1);
//        System.out.println(hungrySingleton1 == hungrySingleton);

        //基于容器实现单例
        ContainerSingleton.putInstance("object", new Object());
        Object o = ContainerSingleton.getInstance("object");
        Object o1 = ContainerSingleton.getInstance("object");
        System.out.println(o);
        System.out.println(o1);
        System.out.println(o1 == o);

    }
}
