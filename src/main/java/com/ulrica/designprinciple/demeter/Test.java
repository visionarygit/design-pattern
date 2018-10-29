package com.ulrica.designprinciple.demeter;

/**
 * 定义：一个对象应该对其他对象保持最少的了解，又叫最少知道原则

 优点： 降低类与类之间的耦合性
 *
 * 迪米特原则：强调只和朋友交流，不和陌生人说话。

 朋友：出现在成员变量、方法的输入、输出参数中的类称为朋友类，而出现在方法体内部的不属于朋友类
 *
 * 场景：Boss让Coder去查下Machine的数量共有多少台
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Coder coder = new Coder();
        boss.getMachines(coder);
    }
}
