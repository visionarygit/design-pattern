package com.ulrica.designpattern.behavioral.iterator;

/***
 *食物迭代器
 *@author 180255
 *@creat 2018-12-20-8:32
 */
public interface FoodIterator {

    Food nextFood();

    boolean isLast();

}
