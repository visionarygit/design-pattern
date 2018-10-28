package com.ulrica.designprinciple.dependenceinversion;

/**
 * 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * 核心：抽象不应该依赖细节，细节应该依赖抽象，针对接口变成，不要针对实现编程
 * 优点：减少类之间到耦合性，提高系统的稳定性，提高代码的可读性和可维护性，可降低修改程序所造成的风险'
 * IOC 原型
 * 高层模块Test与Buy解耦，Buy与具体到某种Item实现解耦，具体购买什么商品由上层模块Test来决定，达到高内聚低耦合
 */
public class Test {

    public static void main(String[] args) {
        Buy buy = new Buy();
        //买鞋
        buy.setItem(new ShoesItem());
        buy.buy();
        //买手机
        buy.setItem(new PhoneItem());
        buy.buy();
    }
}
