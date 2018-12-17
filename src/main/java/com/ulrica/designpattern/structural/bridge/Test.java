package com.ulrica.designpattern.structural.bridge;

/***
 *桥接模式
 * 定义：将抽象部分与它的具体实现不部分分离，使它们都可以独立的变化
 *      通过组合的方式建立两个类之间的联系，而不是继承
 * 优点：分离抽象部分以及具体实现部分
 *      增加系统的扩展性
 * 缺点：增加了系统的理解与设计难度
 *      需要正确的识别出系统中两个独立变化的维度
 *@author 180255
 *@creat 2018-12-17-8:48
 */
public class Test {
    public static void main(String[] args) {
        Bank bank  = new ABCBank(new SavingAccount());
        Account account = bank.openAccount();
        account.showAccountType();

        Bank bank1 = new ICBCBank(new DepositAccount());
        Account account1 = bank1.openAccount();
        account1.showAccountType();
    }
}
