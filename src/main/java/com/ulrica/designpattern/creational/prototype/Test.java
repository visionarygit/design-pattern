package com.ulrica.designpattern.creational.prototype;

import java.util.Date;

/**
 * 原型模式
 * 原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 适用场景：
 * 类初始化消耗较多的资源
 * new产生一个对象需要非常繁琐的过程（数据准备、访问权限等）
 * 构造函数比较复杂
 * 循环体中生产大量对象时
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Food food = new Food();
        food.setName("111");
        food.setCode("sdssd");
        food.setCreateDate(new Date());
        Food food1 = (Food) food.clone();
        System.out.println(food.toString());
        System.out.println(food1.toString());
        //food中的引用类型Date并未被克隆
        food.getCreateDate().setTime(34324242L);
        System.out.println(food.toString());
        System.out.println(food1.toString());

        Food1 food11 = new Food1();
        food11.setName("111");
        food11.setCode("sdssd");
        food11.setCreateDate(new Date());
        Food1 food12 = (Food1) food11.clone();
        System.out.println(food11.toString());
        System.out.println(food12.toString());
        food11.getCreateDate().setTime(34324242L);
        System.out.println(food11.toString());
        System.out.println(food12.toString());
    }
}
