package com.YWT.sm.service;

import com.YWT.sm.entity.Department;
import com.YWT.sm.factory.ServiceFacotry;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DepartmentServiceTest {
    private final DepartmentService departmentService = ServiceFacotry.getDepartmentServiceInstance();
    @Test
    public void selectAll() {
        List<Department> departmentList = departmentService.selectAll();
        departmentList.forEach(System.out::println);
    }
}