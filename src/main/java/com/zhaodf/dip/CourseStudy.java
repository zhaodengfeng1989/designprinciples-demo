package com.zhaodf.dip;

import javax.swing.*;

/**
 * 类：CourseStudy
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class CourseStudy {
    private ICourse iCourse;
    public void setCourse(ICourse iCourse) { this.iCourse = iCourse; }
    public void studyCourse(ICourse iCourse){
        iCourse.study();
    }
}
