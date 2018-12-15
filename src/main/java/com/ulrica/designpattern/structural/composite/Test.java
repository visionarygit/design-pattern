package com.ulrica.designpattern.structural.composite;

/***
 *组合模式
 * 定义：将对象组合成树形结构以表示“部分-整体”的层次机构
 *      组合模式使客户端对单个对象和组合对象保持一致的方式处理
 * 优点：清楚的定义分层次的复杂对象，表示对象的全部或部分层次
 *      让客户端忽略了层次的差异，方便对整个层次结构进行控制
 *      简化客户端代码
 *      符合开闭原则
 * 缺点：限制类型时会比较复杂
 *      使设计变得抽象
 *@author 180255
 *@creat 2018-12-15-8:52
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent catalogComponent = new Course("linux课", 1d);
        CatalogComponent catalogComponent1 = new Course("win课", 2d);

        CatalogComponent catalogComponent2 = new CourseCatalog(2, "电脑课目录");

        CatalogComponent catalogComponent3 = new CourseCatalog(1, "课");

        catalogComponent2.add(catalogComponent);
        catalogComponent2.add(catalogComponent1);

        catalogComponent3.add(catalogComponent2);

        catalogComponent3.print();
    }
}
