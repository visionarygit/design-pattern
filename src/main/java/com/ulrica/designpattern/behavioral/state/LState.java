package com.ulrica.designpattern.behavioral.state;

/***
 *中午
 *@author 180255
 *@creat 2019-01-21-14:29
 */
public class LState extends State {
    @Override
    public void doSomething(Person person) {
        if (person.getHour() == 12) {
            System.out.println("吃午饭");
        } else {
            person.setState(new DState());
            person.doSomething();
        }
    }
}
