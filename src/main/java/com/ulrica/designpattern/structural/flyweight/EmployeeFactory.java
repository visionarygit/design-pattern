package com.ulrica.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/***
 *员工工厂
 *@author 180255
 *@creat 2018-12-14-9:18
 */
public class EmployeeFactory {
    private static Map<String, Manager> managerMap = new HashMap<String, Manager>();

    public static Manager getManager(String department) {
        Manager manager = managerMap.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建了一个： " + department + "部门经理");
            managerMap.put(department, manager);
        }
        return manager;
    }
}
