package com.ulrica.designpattern.structural.composite;

/***
 *结构组件抽象类
 *@author 180255
 *@creat 2018-12-15-9:28
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException();
    }
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }
}
