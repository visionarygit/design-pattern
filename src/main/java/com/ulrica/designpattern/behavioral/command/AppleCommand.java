package com.ulrica.designpattern.behavioral.command;

/***
 *苹果命令类
 *@author 180255
 *@creat 2019-01-16-9:44
 */
public class AppleCommand extends Command {

    public AppleCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sale() {
        this.peddler.saleApple();
    }
}
