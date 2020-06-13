package com.zhaodf.dip;

/**
 * 类：DipTest
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class DipTest {
    public static void main(String[] args) {
        CourseStudy courseStudy = new CourseStudy();
        courseStudy.studyCourse(new JavaCourse());
        courseStudy.studyCourse(new PythonCourse());
        courseStudy.studyCourse(new AICourse());
    }
}
