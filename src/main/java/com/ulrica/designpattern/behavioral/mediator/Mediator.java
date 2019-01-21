package com.ulrica.designpattern.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;

/***
 *中介者
 *@author 180255
 *@creat 2019-01-21-9:20
 */
@Getter
@Setter
public class Mediator {

    private Man man;

    private Women women;

    public void getPartner(Person person) {
        if (person instanceof Man) {
            this.man = (Man) person;
        }else {
            this.women = (Women) person;
        }
        if (man == null || women == null) {
            System.out.println("同性恋。。。。");
            return;
        }
        if (this.man.getCondition() == this.women.getCondition()) {
            System.out.println("在一起");
        }else {
            System.out.println("不合适");
        }
    }
}
