package com.zhaodf.ocp;

/**
 * Hello world!
 *
 */
public class OcpTest
{
    public static void main( String[] args )
    {
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse("1","Java架构课",6800D);
        System.out.println( javaDiscountCourse.getPrice() );
    }
}
