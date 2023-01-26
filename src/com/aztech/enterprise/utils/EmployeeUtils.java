package com.aztech.enterprise.utils;

import com.aztech.enterprise.domain.Employee;

public class EmployeeUtils {

    public static Employee buildEmployee(Integer id, String name, String designation, Integer bossId, String bossName) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setDesignation(designation);
        employee.setBossId(bossId);
        employee.setBossName(bossName);
        return employee;
    }
}
