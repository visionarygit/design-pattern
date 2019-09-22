package com.ulrica.designpattern.creational.singlefactory;

public class FoodEatFactory {

    /**
     * 通过名称来判断实例化某个类，但扩展性差,有新的实例时需修改内部判断逻辑，违背开闭原则
     * @param name
     * @return
     */
    public static Food getFood(String name) {
        Food food = null;
        if ("apple".equals(name)) {
            food = new Apple();
        } else if ("pear".equals(name)) {
            food = new Pear();
        }
        return food;
    }

    /**
     * 通过反射确定实例化的类，扩展性稍强
     * @param c
     * @return
     */
    public static Food getFood (Class c) {
        Food food = null;
        try {
            food = (Food) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return food;
    }

}
