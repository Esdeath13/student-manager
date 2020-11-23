package com.YWT.sm.service;

import com.YWT.sm.utils.ResultEntity;

public interface AdminService {
    /**
     * 管理员登录
     *
     * @param account 账号
     * @param password 密码
     * @return ResultEntity 返回结果
     */
    ResultEntity adminLogin(String account, String password);
}
