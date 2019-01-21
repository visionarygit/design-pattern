package com.ulrica.designpattern.behavioral.state;

/***
 *状态模式
 * 允许通过改变对象的内部状态而改变对象的行为，这个对象表现就好像修改了它的类一样。
 *@author 180255
 *@creat 2019-01-21-13:52
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();

        person.setHour(7);
        person.doSomething();

        person.setHour(1);
        person.doSomething();

        person.setHour(12);
        person.doSomething();

        person.setHour(18);
        person.doSomething();

        person.setHour(11);
        person.doSomething();
    }
}
