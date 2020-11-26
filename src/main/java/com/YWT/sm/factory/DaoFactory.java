package com.YWT.sm.factory;

import com.YWT.sm.dao.AdminDao;
import com.YWT.sm.dao.DepartmentDao;
import com.YWT.sm.dao.impl.AdminDaoImpl;
import com.YWT.sm.dao.impl.DepartmentDaoImpl;
import com.YWT.sm.entity.Department;

public class DaoFactory {
    public static AdminDao getAdminDaoInstance(){
        return new AdminDaoImpl();
    }

    /**
     * 获得DepartmentDao实例
     *
     * @return AdminDao实例
     *
     */
    public static DepartmentDao getDepartmentDaoInstance(){
        return new DepartmentDaoImpl();
    }
}
