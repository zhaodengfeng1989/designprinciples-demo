package com.zhaodf.carp;

/**
 * 类：OracleConnection
 *
 * @author zhaodf
 * @date 2020/6/13
 */
public class MySQLConnection implements DBConnection {
    @Override
    public String getConnection() {
        return "mysql 的数据库连接";
    }
}
