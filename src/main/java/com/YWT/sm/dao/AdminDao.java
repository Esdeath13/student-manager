package com.YWT.sm.dao;

import com.YWT.sm.entity.Admin;

import java.sql.SQLException;

public interface AdminDao {
    /**
     * 根据账号查找管理员
     *
     * @param account: 账号入参
     * @return Admin: 管理员信息
     * @throws SQLException:该方法会抛出异常
     */
    Admin findAdminByAccount(String account) throws SQLException;
}
