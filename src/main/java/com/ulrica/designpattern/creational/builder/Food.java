package com.ulrica.designpattern.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 食物的糖和盐的量
 */
@Getter
@Setter
@ToString
public class Food {

    private Double salt;

    private Double sweet;
}
