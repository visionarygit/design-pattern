package com.ulrica.designpattern.behavioral.observer;

import java.util.Observable;

/***
 *观察者
 *@author 180255
 *@creat 2019-01-15-9:49
 */
public class Observer implements java.util.Observer {

    public void update(Observable o, Object arg) {
        Article article = (Article) arg;
        System.out.println("博主发了新文章。。。。");
        System.out.println("标题为：" + article.getArticleTittle());
        System.out.println("内容为：" + article.getArticleContent());
    }
}
