package com.ulrica.designprinciple.openclose;

public class ShoesDisCountService extends ShoesService {

    public ShoesDisCountService(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //实现打折业务
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.9;
    }

    //获取原始价格
    public Double getOrignPrice() {
        return super.getPrice();
    }
}
