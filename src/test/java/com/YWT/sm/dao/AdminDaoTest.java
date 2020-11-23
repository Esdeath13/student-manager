package com.YWT.sm.dao;

import com.YWT.sm.entity.Admin;
import com.YWT.sm.factory.DaoFactory;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class AdminDaoTest {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();
    @Test
    public void findAdminByAccount() {
        Admin admin;
        try{
            admin = adminDao.findAdminByAccount("yangwentao@qq.com");
            assertEquals("杨文涛", admin.getAdminName());
            System.out.println(admin);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}