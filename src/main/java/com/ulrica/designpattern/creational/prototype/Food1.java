package com.ulrica.designpattern.creational.prototype;

import java.util.Date;

public class Food1 implements Cloneable{
    private String name;

    private String code;

    private Date createDate;

    public Food1() {
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
     * 深克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Food1 food1 = (Food1) super.clone();
        this.createDate = (Date) createDate.clone();
        return food1;
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
