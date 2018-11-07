package com.ulrica.designpattern.creational.builder.v2;

/**
 * 定义：将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 用户只需要指定要建造的类型就可以得到他们，建造过程及细节不需要知道
 * 使用场景：如果一个对象由非常复杂到内部结构（拥有很多属性）
 *          想把复杂对象的创建与使用分离
 * 优点: 封装性好，创建和使用分离 实现链式调用
 *      扩展性好，建造类之间独立、一定程度上解耦
 */
public class Test {
    public static void main(String[] args) {
        Food food = new Food.FoodBuilder()
                .salt(2.3d)
                .sweet(2.5d)
                .build();
        System.out.println(food);
    }
}
