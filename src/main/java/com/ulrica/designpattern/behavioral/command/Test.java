package com.ulrica.designpattern.behavioral.command;

/***
 *命令模式:封装了对目标对象的调用行为以及调用参数。
 * 使用场景：
 *  整个调用过程比较复杂，或者存在多处这种调用
 *  调用前后需要对调用参数进行某些处理
 *  调用前后需要进行某些额外处理，比如日志、缓存、记录历史操作等
 *@author 180255
 *@creat 2019-01-16-9:15
 */
public class Test {

    public static void main(String[] args) {
        Peddler peddler = new Peddler();
        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);

        Waiter waiter = new Waiter();
        waiter.setOrder(bananaCommand);
        waiter.setOrder(appleCommand);
        waiter.sale();
    }
}
