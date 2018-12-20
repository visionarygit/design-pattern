package com.ulrica.designpattern.behavioral.iterator;

import java.util.List;

/***
 *迭代器实现类
 *@author 180255
 *@creat 2018-12-20-8:33
 */
public class FoodIteratorImpl implements FoodIterator {

    private int position;

    private Food currentFood;

    private List<Food> list;

    public FoodIteratorImpl(List<Food> list) {
        this.list = list;
    }

    public Food nextFood() {
        currentFood = list.get(position);
        position ++;
        return currentFood;
    }

    public boolean isLast() {
        if (position < list.size()) {
            return false;
        }
        return true;
    }
}
