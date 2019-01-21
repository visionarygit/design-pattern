package com.ulrica.designpattern.behavioral.state;

/***
 *无
 *@author 180255
 *@creat 2019-01-21-14:36
 */
public class NoState extends State {
    @Override
    public void doSomething(Person person) {
        System.out.println("未定义");
    }
}
