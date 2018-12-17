package com.ulrica.designpattern.structural.bridge;

/***
 *活期账户
 *@author 180255
 *@creat 2018-12-17-9:21
 */
public class SavingAccount implements Account {

    public Account openAccount() {
        System.out.println("打开一个活期账户");
        return new SavingAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}
