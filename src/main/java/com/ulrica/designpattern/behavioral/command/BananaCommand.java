package com.ulrica.designpattern.behavioral.command;

/***
 *香蕉命令类
 *@author 180255
 *@creat 2019-01-16-9:45
 */
public class BananaCommand extends Command {
    public BananaCommand(Peddler peddler) {
        super(peddler);
    }

    @Override
    public void sale() {
        this.peddler.saleBanana();
    }
}
