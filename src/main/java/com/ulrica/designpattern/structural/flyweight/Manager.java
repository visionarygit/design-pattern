package com.ulrica.designpattern.structural.flyweight;

import lombok.Data;

/***
 *部门经理
 *@author 180255
 *@creat 2018-12-14-9:15
 */
@Data
public class Manager implements Employee {


    private String department;

    public void doReport() {
        System.out.println(department + "经理做了报告");
    }

    public Manager(String department) {
        this.department = department;
    }
}
