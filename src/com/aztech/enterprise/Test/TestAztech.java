package com.aztech.enterprise.Test;

import com.aztech.enterprise.Aztech;
import com.aztech.enterprise.HRDept;
import com.aztech.enterprise.domain.Employee;

import java.util.List;

public class TestAztech {
    public static void main(String[] args) {
        HRDept aztechHrDept = new HRDept();

        List<Employee> managersForSD = aztechHrDept.getManagersForSeniorDirector(7);

        for(Employee manager: managersForSD) {
           System.out.println("#####################################");
           System.out.println(manager.getId());
            System.out.println(manager.getName());
            System.out.println(manager.getBossId());
            System.out.println(manager.getBossName());
            System.out.println(manager.getDesignation());
            System.out.println("#####################################");
        }
    }
}
