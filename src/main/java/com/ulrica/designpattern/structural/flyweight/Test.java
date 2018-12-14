package com.ulrica.designpattern.structural.flyweight;

/***
 *享元模式
 * 定义：提供了减少对象数量从而改善应用所需的对象结构的方式
 *      运用共享技术有效地支持大量细粒度的对象
 * 使用场景：常常应用于系统的底层的开发，以便解决系统的性能问题；系统有大量的相似对象、需要缓冲池的场景
 * 优点： 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率；减少内存之外的其他资源占用
 * 缺点：需要关注内/外部状态、关注线程安全问题
 *      使系统的逻辑复杂化
 * 源码应用：Integer,Long 连接池等
 *@author 180255
 *@creat 2018-12-14-9:08
 */
public class Test {

    public static void main(String[] args) {
         String[] departments = new String[]{"计算机中心", "物联网研究院", "通信技术研究院"};
        for (int i = 0; i < 10; i++) {
            Manager manager = EmployeeFactory.getManager(departments[(int)(Math.random() * departments.length)]);
            manager.doReport();
        }
    }

}
