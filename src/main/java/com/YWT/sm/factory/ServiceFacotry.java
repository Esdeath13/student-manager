package com.YWT.sm.factory;

import com.YWT.sm.service.AdminService;
import com.YWT.sm.service.impl.AdminServiceImpl;

public class ServiceFacotry {
    public static AdminService getAdminServiceInstance(){
        return new AdminServiceImpl();
    }
}
