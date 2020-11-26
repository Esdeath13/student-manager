package com.YWT.sm.service;

import com.YWT.sm.entity.Department;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author YWT
 * @Date 2020/11/23 19:44
 **/
public interface DepartmentService {
    /**
     * 查询所有院系
     *
     * @return List<Department>
     *
     */
    List<Department> selectAll();

    /**
     * 新增院系
     *
     * @return int
     *
     */
    int addDepartment(Department department);
}


