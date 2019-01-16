package com.ulrica.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/***
 *售货员
 *@author 180255
 *@creat 2019-01-16-9:47
 */
public class Waiter {

    private List<Command> commands = new ArrayList<Command>();

    public void setOrder(Command order) {
        commands.add(order);
    }

    public void remove(Command command) {
        commands.remove(command);
    }

    public void sale() {
        commands.forEach(Command::sale);
    }
}
