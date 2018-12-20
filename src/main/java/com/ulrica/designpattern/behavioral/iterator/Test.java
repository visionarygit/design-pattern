package com.ulrica.designpattern.behavioral.iterator;

/***
 *迭代器模式
 * 定义：提供一种方法，顺序访问一个集合对象中的各个元素，而又不暴露该对象的内部表示
 *  使用场景：
 *      访问一个集合对象的内容而无需暴露它的内部表示
 *      为遍历不同的集合结构提供一个统一的接口
 *@author 180255
 *@creat 2018-12-20-8:19
 */
public class Test {
    public static void main(String[] args) {
        FoodAggregate foodAggregate = new FoodAggregateImpl();
        foodAggregate.add(new Food("鸡"));
        foodAggregate.add(new Food("鸭"));
        foodAggregate.add(new Food("鹅"));
        foodAggregate.add(new Food("鱼"));
        foodAggregate.add(new Food("肉"));

        FoodIterator foodIterator = foodAggregate.getIterator();
        while (!foodIterator.isLast()) {
            Food food = foodIterator.nextFood();
            System.out.println(food);
        }
    }

}
