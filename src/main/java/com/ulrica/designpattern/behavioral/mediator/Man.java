package com.ulrica.designpattern.behavioral.mediator;

/***
 *男人 
 *@author 180255
 *@creat 2019-01-21-9:20
 */
public class Man extends Person {
    public Man(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    void getPartner(Person person) {
        this.mediator.setMan(this);
        this.mediator.getPartner(person);
    }
}
