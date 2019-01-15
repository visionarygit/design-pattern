package com.ulrica.designpattern.behavioral.observer;

import java.util.Observable;

/***
 *博主(被观察者)
 *@author 180255
 *@creat 2019-01-15-9:43
 */
public class BlogUser extends Observable {

    public void create(Article article) {
        System.out.println("发表博文");
        this.setChanged();
        this.notifyObservers(article);
    }
}
