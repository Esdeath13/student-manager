package com.YWT.sm.factory;

import com.YWT.sm.dao.AdminDao;
import com.YWT.sm.dao.impl.AdminDaoImpl;

public class DaoFactory {
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
    }
}
