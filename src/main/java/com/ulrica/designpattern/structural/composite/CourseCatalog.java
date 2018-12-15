package com.ulrica.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/***
 *课程目录
 *@author 180255
 *@creat 2018-12-15-9:41
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> courses = new ArrayList<CatalogComponent>();
    private Integer level;
    private String name;

    public CourseCatalog(Integer level, String name) {
        this.level = level;
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        this.courses.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        this.courses.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent cours : courses) {
            if (this.level != null) {
                for (Integer i = 0; i < this.level; i++) {
                    System.out.print("    ");
                }
            }
            cours.print();
        }
    }
}
