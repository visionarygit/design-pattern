package com.ulrica.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/***
 *食物集合操作实现类
 *@author 180255
 *@creat 2018-12-20-8:37
 */
public class FoodAggregateImpl implements FoodAggregate {

    private List<Food> foodList;

    public FoodAggregateImpl() {
        this.foodList = new ArrayList<Food>();
    }

    public void add(Food food) {
        foodList.add(food);
    }

    public void remove(Food food) {
        foodList.remove(food);
    }

    public FoodIterator getIterator() {
        return new FoodIteratorImpl(foodList);
    }
}
