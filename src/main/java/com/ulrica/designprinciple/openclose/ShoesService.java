package com.ulrica.designprinciple.openclose;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/***
 * 鞋子服务
 */
@AllArgsConstructor
@NoArgsConstructor
public class ShoesService implements ItemService {

    private Integer id;

    private String name;

    private Double price;

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
