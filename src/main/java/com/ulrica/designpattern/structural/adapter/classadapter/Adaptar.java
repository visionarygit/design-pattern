package com.ulrica.designpattern.structural.adapter.classadapter;

/***
 *适配器
 * 继承被适配者，实现目标接口，实现中调用父级方法
 *@author 180255
 *@creat 2018-12-13-9:21
 */
public class Adaptar extends Adaptee implements Target {
    public void request() {
        super.adapteeRequest();
    }
}
