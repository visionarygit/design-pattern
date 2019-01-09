package com.ulrica.designpattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/***
 *备忘录
 *@author 180255
 *@creat 2019-01-09-9:17
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonMemento {
    private String name;

    private String sex;
}
