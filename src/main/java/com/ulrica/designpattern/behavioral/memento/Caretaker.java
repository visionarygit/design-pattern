package com.ulrica.designpattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/***
 *管理者
 *@author 180255
 *@creat 2019-01-09-9:19
 */
@Getter
@Setter
@AllArgsConstructor
public class Caretaker {

    private PersonMemento personMemento;

}
