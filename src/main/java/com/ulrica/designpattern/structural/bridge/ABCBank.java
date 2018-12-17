package com.ulrica.designpattern.structural.bridge;

/***
 *农业银行
 *@author 180255
 *@creat 2018-12-17-9:27
 */
public class ABCBank extends Bank{

    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开农业银行账户");
        account.openAccount();
        return account;
    }
}
