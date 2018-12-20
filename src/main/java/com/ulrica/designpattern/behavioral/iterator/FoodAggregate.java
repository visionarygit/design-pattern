package com.ulrica.designpattern.behavioral.iterator;

/***
 *食物集合的操作接口
 *@author 180255
 *@creat 2018-12-20-8:30
 */
public interface FoodAggregate {

    void add(Food food);

    void remove(Food food);

    FoodIterator getIterator();

}
