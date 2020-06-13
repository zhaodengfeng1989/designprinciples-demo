package com.zhaodf.lsp;

import com.zhaodf.ocp.JavaCourse;

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


    public Double getDiscountCoursePrice() {
        return super.getPrice()*0.8;
    }
}
