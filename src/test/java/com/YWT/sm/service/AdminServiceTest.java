package com.YWT.sm.service;

import com.YWT.sm.factory.ServiceFacotry;
import com.YWT.sm.utils.ResultEntity;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdminServiceTest {
    private final AdminService adminService = ServiceFacotry.getAdminServiceInstance();

    @Test
    public void adminLogin() {
        ResultEntity resultEntity = adminService.adminLogin("yangwentao@qq.com","qazwsx123");
        assertEquals(0,resultEntity.getCode());
        System.out.println(resultEntity);
    }
}