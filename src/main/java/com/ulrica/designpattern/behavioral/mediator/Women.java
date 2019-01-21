package com.ulrica.designpattern.behavioral.mediator;

/***
 *女人
 *@author 180255
 *@creat 2019-01-21-9:20
 */
public class Women extends Person {
    public Women(String name, int condition, Mediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    void getPartner(Person person) {
        this.mediator.setWomen(this);
        this.mediator.getPartner(person);
    }
}
