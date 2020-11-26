package com.YWT.sm.dao;

import com.YWT.sm.entity.Department;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName DepartmentDao
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/23 19:19
 **/
public interface DepartmentDao {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     * @throws SQLException 异常
     */
    List<Department> getALL() throws SQLException;

    /**
     * 新增院系
     *
     * @param department 入参
     * @return int
     * @throws SQLException 异常
     */
    int insertDepartment(Department department) throws SQLException;
}
