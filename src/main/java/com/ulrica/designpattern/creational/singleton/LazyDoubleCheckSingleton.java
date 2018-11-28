package com.ulrica.designpattern.creational.singleton;

/**
 * 双重锁懒汉模式
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton() {

    }

    //volatile使内存状态所有线程可见，此变量在进行写操作时的数据写回到系统内存，使其他cpu缓存的数据无效（缓存一致性）
    //在其他线程在使用此对象时重新去系统内存中获取
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public static LazyDoubleCheckSingleton getInstance() {
        if(lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    /**
                     * 对象初始化过程：
                     * 1.memory = allocate() 分配对象的内存空间
                     * 2.ctorInstance() 初始化对象
                     * 3.instance = memory 设置instance指向刚分配的内存
                     * java语言规范允许对单线程执行过程没有影响的指令进行重排序，也就是说2和3步可能进行顺序重排
                     *解决此问题有两种方案：
                     *  1、禁止2、3重拍序
                     *  2、允许2、3重拍序但不能被其他线程看到（基于静态内部类）
                     */
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

}
