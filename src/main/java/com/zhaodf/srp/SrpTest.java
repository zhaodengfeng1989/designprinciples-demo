package com.zhaodf.srp;

import com.zhaodf.ocp.JavaDiscountCourse;

/**
 * Hello world!
 *
 */
public class SrpTest
{
    public static void main( String[] args )
    {
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");

        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
