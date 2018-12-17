package com.ulrica.designpattern.structural.bridge;

/***
 *银行抽象类
 *@author 180255
 *@creat 2018-12-17-9:23
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
