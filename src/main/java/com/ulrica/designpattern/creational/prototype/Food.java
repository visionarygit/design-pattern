package com.ulrica.designpattern.creational.prototype;

import java.util.Date;

public class Food implements Cloneable{

    private String name;

    private String code;

    private Date createDate;

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
