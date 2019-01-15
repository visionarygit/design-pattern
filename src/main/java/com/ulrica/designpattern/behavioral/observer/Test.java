package com.ulrica.designpattern.behavioral.observer;

/***
 *观察者模式：它的作用是当一个对象的状态发生变化时，能够自动通知其他关联对象，自动刷新对象状态。
 * 提供给关联对象一种同步通信的手段，使某个对象与依赖它的其他对象之间保持状态同步。
 * 角色和职责：
 * subject(被观察者):被观察的对象，当需要被观察的状态发生变化时，需要通知队列中所有观察者对象，Subject需要维持（添加，删除，通知）一个观察者对象的队列列表。
 * concreteSubject:被观察者的具体实现，包含一些基本的属性状态及其他操作
 * observer:接口或抽象类，当subject的状态发生变化时，observer对象将通过一个callback函数得到通知
 * concreteobserver:观察者的具体实现，得到通知后将完成一些具体的业务逻辑处理。
 *@author 180255
 *@creat 2019-01-15-8:57
 */
public class Test {

    public static void main(String[] args) {
        Article article = new Article();
        article.setArticleTittle("java成神之路");
        article.setArticleContent("xxxxxxxxxxxxxx");
        BlogUser blogUser = new BlogUser();
        blogUser.addObserver(new Observer());
        blogUser.create(article);
    }
}
