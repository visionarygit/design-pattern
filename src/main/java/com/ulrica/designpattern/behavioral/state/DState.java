package com.ulrica.designpattern.behavioral.state;

/***
 *晚上
 *@author 180255
 *@creat 2019-01-21-14:29
 */
public class DState extends State {
    @Override
    public void doSomething(Person person) {
        if (person.getHour() == 18) {
            System.out.println("吃晚饭");
        }else {
            person.setState(new NoState());
            person.doSomething();
        }
    }
}
