package com.ulrica.designpattern.structural.adapter;

import com.ulrica.designpattern.structural.adapter.objectadapter.Adaptar;
import com.ulrica.designpattern.structural.adapter.objectadapter.ConcreteTarget;
import com.ulrica.designpattern.structural.adapter.objectadapter.Target;

/***
 *适配器模式
 * 定义：将一个类的接口转换成客户期望的另一个接口
 * 优点：能提高类的透明性和复用，现有的类复用但不需要改变
 *      目标类与适配器类解耦，提高程序的扩展性
 *      符合开闭原则
 * 缺点：适配器编写过程需要全面考虑，可能会增加系统的复杂性
 *      增加系统代码可读的难度
 * 类适配器模式和对象适配器模式的区别：类适配器为继承，对象适配器为组合  组合优先考虑于继承
 *@author 180255
 *@creat 2018-12-13-9:10
 */
public class Test {

    /**
     * 类适配器模式
     * @param args
     */
//    public static void main(String[] args) {
//        Target target = new ConcreteTarget();
//        target.request();
//
//        Target target1 = new Adaptar();
//        target1.request();
//    }

    /**
     * 对象适配器模式
     * @param args
     */
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adaptar();
        target1.request();
    }

}
