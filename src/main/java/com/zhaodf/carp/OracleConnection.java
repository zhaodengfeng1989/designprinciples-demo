package com.zhaodf.carp;

/**
 * 类：OracleConnection
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class OracleConnection implements DBConnection {
    @Override
    public String getConnection() {
        return "oracle 的数据库连接";
    }
}
