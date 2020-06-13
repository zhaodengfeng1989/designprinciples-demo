package com.zhaodf.dip;

/**
 * 类：JavaCourse
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("学习Java课程！");
    }
}
