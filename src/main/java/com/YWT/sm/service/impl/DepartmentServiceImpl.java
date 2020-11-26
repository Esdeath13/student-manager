package com.YWT.sm.service.impl;

import com.YWT.sm.dao.DepartmentDao;
import com.YWT.sm.entity.Department;
import com.YWT.sm.factory.DaoFactory;
import com.YWT.sm.service.DepartmentService;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/23 19:46
 **/
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentDao departmentDao = DaoFactory.getDepartmentDaoInstance();

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = null;
        try {
            departmentList = departmentDao.getALL();
        }catch (SQLException e){
            System.err.print("查询院系信息出现异常");
        }
        return departmentList;

    }
    @Override
    public int addDepartment(Department department) {
        int n = 0;
        try {
            n = departmentDao.insertDepartment(department);
        }catch (SQLException e){
            System.err.println("新增院系信息出现异常");
        }
        return n;
    }
}
