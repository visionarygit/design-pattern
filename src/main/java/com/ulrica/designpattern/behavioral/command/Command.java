package com.ulrica.designpattern.behavioral.command;

/***
 *抽象命令
 *@author 180255
 *@creat 2019-01-16-9:43
 */
public abstract class Command {

    protected Peddler peddler;

    public Command(Peddler peddler) {
        this.peddler = peddler;
    }

    public abstract void sale();
}
