package com.ulrica.designpattern.creational.singleton.register;

public enum EnumSingleton {
    INSTANCE {
        @Override
        public void test() {
            System.out.println("test");
        }
    };

    public abstract void test();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
