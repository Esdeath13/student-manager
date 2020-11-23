package com.YWT.sm.dao.impl;

import com.YWT.sm.dao.AdminDao;
import com.YWT.sm.entity.Admin;
import com.YWT.sm.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDaoImpl implements AdminDao {
    @Override
    public Admin findAdminByAccount(String account) throws SQLException {
        JdbcUtil jdbcUtil = JdbcUtil.getInitJdbcUtil();
        Connection connection = jdbcUtil.getConnection();
        String sql =  "SELECT * FROM t_admin WHERE account = ? ";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, account);
        ResultSet rs = pstmt.executeQuery();
        Admin admin = null;
        while (rs.next()){
            int id = rs.getInt("id");
            String adminAccount = rs.getString("account");
            String password = rs.getString("password");
            String adminName = rs.getString("admin_name");

            admin = new Admin();
            admin.setId(id);
            admin.setAccount(account);
            admin.setAdminName(adminName);
            admin.setPassword(password);
        }
        rs.close();
        pstmt.close();
        jdbcUtil.closeConnection();
        return  admin;
    }
}