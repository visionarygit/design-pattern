package com.ulrica.designpattern.behavioral.state;

import lombok.Getter;
import lombok.Setter;

/***
 *ren
 *@author 180255
 *@creat 2019-01-21-14:26
 */
@Setter
@Getter
public  class Person {

    private int hour;

    private State state;

    public Person() {
        state = new MState();
    }

    public void doSomething() {
         state.doSomething(this);
        state = new MState();
    }
}
