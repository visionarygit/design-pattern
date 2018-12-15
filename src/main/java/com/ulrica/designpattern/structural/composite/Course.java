package com.ulrica.designpattern.structural.composite;

/***
 *课程
 *@author 180255
 *@creat 2018-12-15-9:32
 */
public class Course extends CatalogComponent {

    private String name;
    private Double price;

    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程：" + name + "价格为：" + price);
    }
}
