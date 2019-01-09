package com.ulrica.designpattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/***
 *
 *@author 180255
 *@creat 2019-01-09-9:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private String name;

    private String sex;

    /**
     * 创建备忘录
     * @return
     */
    public PersonMemento createMemento(){
        return new PersonMemento(name, sex);
    }

    public void setMemento(PersonMemento memento) {
        this.name = memento.getName();
        this.sex = memento.getSex();
    }
}
