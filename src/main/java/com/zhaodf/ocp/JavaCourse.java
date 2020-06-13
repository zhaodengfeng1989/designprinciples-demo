package com.zhaodf.ocp;

/**
 * 类：JavaCourse
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class JavaCourse implements ICourse{
    private String id;
    private String name;

    public JavaCourse(String id, String name, Double price) {
        id = id;
        this.name = name;
        this.price = price;
    }

    private Double price;

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
