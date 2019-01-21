package com.ulrica.designpattern.behavioral.state;

/***
 *早上
 *@author 180255
 *@creat 2019-01-21-14:28
 */
public class MState extends State {
    @Override
    public void doSomething(Person person) {
        if (person.getHour() == 7) {
            System.out.println("吃早饭");
        } else {
            person.setState(new LState());
            person.doSomething();
        }
    }
}
