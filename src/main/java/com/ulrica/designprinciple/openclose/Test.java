package com.ulrica.designprinciple.openclose;

/**
 * 定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭
 * 核心：用抽象构建框架，用实现扩展细节
 * 优点：提高软件系统到可复用性及可维护性
 * 业务场景：
 * <p>
 *     在已有接口类ItemService和实现类的情况下，需要对Shoes进行打折处理，此时不宜直接更改锁接口类，
 *      以免对其他实现类造成影响
 *      通过新建一个子类继承Shoes类到方式来重写获取价格方法
 * </p>
 */
public class Test {
    public static void main(String[] args) {
        ItemService itemService = new ShoesDisCountService(1, "阿迪达斯", 322d);
        ShoesDisCountService shoesDisCountService = (ShoesDisCountService) itemService;
        System.out.printf("id: "+shoesDisCountService.getId() + "品牌: "+shoesDisCountService.getName()
                + "原始价格：" + shoesDisCountService.getOrignPrice() + "折扣价格：" + shoesDisCountService.getPrice());
    }
}
