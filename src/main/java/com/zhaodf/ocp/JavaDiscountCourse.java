package com.zhaodf.ocp;

/**
 * 类：JavaDiscountCourse
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(String id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
