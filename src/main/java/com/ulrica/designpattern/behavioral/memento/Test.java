package com.ulrica.designpattern.behavioral.memento;

/***
 *备忘录模式
 * 保存对象的内部状态，并在需要的时候恢复以前的状态
 * Originator(原生者)：需要被保存状态以便恢复的那个对象
 * Memento(备忘录):该对象有Originator创建，主要用来保存Originator的内部状态
 * Caretaker(管理者)：负责在适当的时间保存/恢复Originator对象的状态
 *@author 180255
 *@creat 2019-01-09-8:51
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person("猫", "nan");
        System.out.println(person.toString());

        Caretaker caretaker = new Caretaker(person.createMemento());
        person.setName("狗");
        person.setSex("nv");
        System.out.println(person.toString());

        person.setMemento(caretaker.getPersonMemento());
        System.out.println(person.toString());
    }
}
