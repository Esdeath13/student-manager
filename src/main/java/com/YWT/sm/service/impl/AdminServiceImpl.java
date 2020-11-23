package com.YWT.sm.service.impl;

import com.YWT.sm.dao.AdminDao;
import com.YWT.sm.entity.Admin;
import com.YWT.sm.factory.DaoFactory;
import com.YWT.sm.service.AdminService;
import com.YWT.sm.utils.ResultEntity;
import org.apache.commons.codec.digest.DigestUtils;

import java.sql.SQLException;

public class AdminServiceImpl implements AdminService {
    private final AdminDao adminDao = DaoFactory.getAdminDaoInstance();

    @Override
    public ResultEntity adminLogin(String account, String password) {
        ResultEntity resultEntity;
        Admin admin = null;
        try{
            admin = adminDao.findAdminByAccount(account);
        }catch (SQLException E){
            System.err.println("根据账号查找管理员信息出现SQL异常");
        }
        if (admin != null){
            if (DigestUtils.md5Hex(password).equals(admin.getPassword())){
                resultEntity = ResultEntity.builder().code(0).message("登录成功").data(admin).build();
            }else {
                resultEntity = ResultEntity.builder().code(1).message("登录失败").build();
            }
        }else {
            resultEntity = ResultEntity.builder().code(2).message("账号不存在").build();
        }
        return resultEntity;
    }
}
