package com.YWT.sm.factory;

import com.YWT.sm.service.AdminService;
import com.YWT.sm.service.DepartmentService;
import com.YWT.sm.service.impl.AdminServiceImpl;
import com.YWT.sm.service.impl.DepartmentServiceImpl;

public class ServiceFacotry {
    public static AdminService getAdminServiceInstance(){
        return new AdminServiceImpl();
    }
    public static DepartmentService getDepartmentServiceInstance(){
        return new DepartmentServiceImpl();
    }
}
