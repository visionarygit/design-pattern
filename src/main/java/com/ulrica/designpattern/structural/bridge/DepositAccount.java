package com.ulrica.designpattern.structural.bridge;

/***
 *定期账户
 *@author 180255
 *@creat 2018-12-17-9:22
 */
public class DepositAccount implements Account {
    public Account openAccount() {
        System.out.println("打开一个定期账户");
        return new DepositAccount();
    }

    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}
