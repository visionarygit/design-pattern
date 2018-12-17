package com.ulrica.designpattern.structural.bridge;

/***
 *工商银行
 *@author 180255
 *@creat 2018-12-17-9:29
 */
public class ICBCBank extends Bank {

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开一个工商银行账户");
        //进行实现类委托
        account.openAccount();
        return account;
    }
}
