package com.ulrica.designpattern.behavioral.mediator;

/***
 *中介者模式
 * 在mediator模式中，类之间的交互行为被统一放在Mediator的对象中，对象通过mediator对象同其他对象交互，mediator对象起着控制器的作用
 * 优点：将系统按功能分割成更小的对象，符合类的最小设计原则
 *      对关联对象的集中控制
 *      减小类的耦合程度，明确类之间的项目关系
 *      有利于提高类的重用性
 *@author 180255
 *@creat 2019-01-21-8:41
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Person zhangsan = new Man("张三", 1, mediator);

        Person lisi = new Man("李四", 1, mediator);

        Person xiaoli = new Women("小丽", 1, mediator);

        zhangsan.getPartner(lisi);

        zhangsan.getPartner(xiaoli);
    }
}
