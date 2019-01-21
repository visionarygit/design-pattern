package com.ulrica.designpattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/***
 *人抽象类
 *@author 180255
 *@creat 2019-01-21-9:19
 */
@Setter
@Getter
@AllArgsConstructor
public abstract class Person {

    private String name;

    private int condition;

    protected Mediator mediator;

    abstract void getPartner(Person person);

}
