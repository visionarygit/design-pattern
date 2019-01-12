package com.ulrica.designpattern.behavioral.visitor;

/***
 *访问者模式
 * 分离对象的数据和行为，可以不修改已有类的情况下，增加新的操作
 * 访问者角色：
 *  为该对象结构中具体元素角色声明一个访问的操作接口。该操作接口的名字和参数标识了发送访问请求给具体访问者的具体元素角色。
 *  这样访问者就可以通过该元素角色的特定接口直接访问它。
 * 具体访问者角色：
 *  实现每个由访问者角色声明的操作
 * 元素角色：
 *  定义一个Accept操作，它以一个访问者为参数。
 * 具体元素角色：
 *  实现由元素角色提供的Accept操作。
 * 对象结构角色：
 *  这是使用访问者模式必备的角色，它要具备以下特征：能枚举它的元素；可以提供一个高层的接口以允许该访问者访问它的元素；可以是一个复合或者是一个集合，如一个列表或一个无序集合。
 * 场景：公园有不同的区域，不同的人访问有不同的效果.
 *@author 180255
 *@creat 2019-01-11-11:30
 */
public class Test {

    public static void main(String[] args) {
        Park park = new Park();
        Vistor vistorA = new VistorA();
        park.accept(vistorA);

        Vistor vistorB = new VistorB();
        park.accept(vistorB);

        Vistor vistorAdmin = new ParkAdmin();
        park.accept(vistorAdmin);
    }
}
