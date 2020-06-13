package com.zhaodf.lkp;

import java.util.List;

/**
 * 类：TeamLeader
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class TeamLeader {
    private IWorkManage iWorkManage;

    public TeamLeader(IWorkManage iWorkManage) {
        this.iWorkManage = iWorkManage;
    }

    public void checkNumberOfCourses(){
        iWorkManage.checkNumberOfCourses();
    }
}
