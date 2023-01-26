package com.aztech.enterprise;

import com.aztech.enterprise.domain.Employee;
import com.aztech.enterprise.utils.EmployeeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HRDept implements Aztech {
    @Override
    public String department() {
        return "HR Department";
    }

    public List<Employee> buildHREmployees() {
        List<Employee> hremployees = new ArrayList<>();
        // Employee CEO
        hremployees.add(EmployeeUtils.buildEmployee(1, "CEO1", "CEO", null, null));

        // Employees Senior Directors
        hremployees.add(EmployeeUtils.buildEmployee(2, "SD1", "SD", 1, "CEO1"));
        hremployees.add(EmployeeUtils.buildEmployee(3, "SD2", "SD", 1, "CEO1"));
        hremployees.add(EmployeeUtils.buildEmployee(4, "SD3", "SD", 1, "CEO1"));
        hremployees.add(EmployeeUtils.buildEmployee(5, "SD4", "SD", 1, "CEO1"));
        hremployees.add(EmployeeUtils.buildEmployee(6, "SD5", "SD", 1, "CEO1"));
        hremployees.add(EmployeeUtils.buildEmployee(7, "SD6", "SD", 1, "CEO1"));
        hremployees.add(EmployeeUtils.buildEmployee(8, "SD7", "SD", 1, "CEO1"));
        hremployees.add(EmployeeUtils.buildEmployee(9, "SD8", "SD", 1, "CEO1"));

        // SD1
        hremployees.add(EmployeeUtils.buildEmployee(10, "D1", "D", 2, "SD1"));
        hremployees.add(EmployeeUtils.buildEmployee(11, "D2", "D", 2, "SD1"));
        hremployees.add(EmployeeUtils.buildEmployee(12, "D3", "D", 2, "SD1"));
        hremployees.add(EmployeeUtils.buildEmployee(13, "D4", "D", 2, "SD1"));

        //D2
        hremployees.add(EmployeeUtils.buildEmployee(14, "D5", "D", 3, "SD2"));
        hremployees.add(EmployeeUtils.buildEmployee(15, "D6", "D", 3, "SD2"));
        hremployees.add(EmployeeUtils.buildEmployee(16, "D7", "D", 3, "SD2"));
        hremployees.add(EmployeeUtils.buildEmployee(17, "D8", "D", 3, "SD2"));

        //D3
        hremployees.add(EmployeeUtils.buildEmployee(18, "D9", "D", 4, "SD3"));
        hremployees.add(EmployeeUtils.buildEmployee(19, "D10", "D", 4, "SD3"));
        hremployees.add(EmployeeUtils.buildEmployee(20, "D11", "D", 4, "SD3"));
        hremployees.add(EmployeeUtils.buildEmployee(21, "D12", "D", 4, "SD3"));

        //D4
        hremployees.add(EmployeeUtils.buildEmployee(22, "D13", "D", 5, "SD4"));
        hremployees.add(EmployeeUtils.buildEmployee(23, "D14", "D", 5, "SD4"));
        hremployees.add(EmployeeUtils.buildEmployee(24, "D15", "D", 5, "SD4"));
        hremployees.add(EmployeeUtils.buildEmployee(25, "D16", "D", 5, "SD4"));

        //D5
        hremployees.add(EmployeeUtils.buildEmployee(26, "D17", "D", 6, "SD5"));
        hremployees.add(EmployeeUtils.buildEmployee(27, "D18", "D", 6, "SD5"));
        hremployees.add(EmployeeUtils.buildEmployee(28, "D19", "D", 6, "SD5"));
        hremployees.add(EmployeeUtils.buildEmployee(29, "D20", "D", 6, "SD5"));

        //D6
        hremployees.add(EmployeeUtils.buildEmployee(30, "D21", "D", 7, "SD6"));
        hremployees.add(EmployeeUtils.buildEmployee(31, "D22", "D", 7, "SD6"));
        hremployees.add(EmployeeUtils.buildEmployee(32, "D23", "D", 7, "SD6"));
        hremployees.add(EmployeeUtils.buildEmployee(33, "D24", "D", 7, "SD6"));

        //D7
        hremployees.add(EmployeeUtils.buildEmployee(34, "D25", "D", 8, "SD7"));
        hremployees.add(EmployeeUtils.buildEmployee(35, "D26", "D", 8, "SD7"));
        hremployees.add(EmployeeUtils.buildEmployee(36, "D27", "D", 8, "SD7"));
        hremployees.add(EmployeeUtils.buildEmployee(37, "D28", "D", 8, "SD7"));

        //D8
        hremployees.add(EmployeeUtils.buildEmployee(38, "D29", "D", 9, "SD8"));
        hremployees.add(EmployeeUtils.buildEmployee(39, "D30", "D", 9, "SD8"));
        hremployees.add(EmployeeUtils.buildEmployee(40, "D31", "D", 9, "SD8"));
        hremployees.add(EmployeeUtils.buildEmployee(41, "D32", "D", 9, "SD8"));

        // M1
        hremployees.add(EmployeeUtils.buildEmployee(42, "M1", "M", 10, "D1"));
        hremployees.add(EmployeeUtils.buildEmployee(43, "M2", "M", 10, "D1"));

        //M2
        hremployees.add(EmployeeUtils.buildEmployee(44, "M3", "M", 11, "D2"));
        hremployees.add(EmployeeUtils.buildEmployee(45, "M4", "M", 11, "D2"));

        //M3
        hremployees.add(EmployeeUtils.buildEmployee(46, "M5", "M", 12, "D3"));
        hremployees.add(EmployeeUtils.buildEmployee(47, "M6", "M", 12, "D3"));

        //M4
        hremployees.add(EmployeeUtils.buildEmployee(48, "M7", "M", 13, "D4"));
        hremployees.add(EmployeeUtils.buildEmployee(49, "M8", "M", 13, "D4"));

        //M5
        hremployees.add(EmployeeUtils.buildEmployee(50, "M9", "M", 14, "D5"));
        hremployees.add(EmployeeUtils.buildEmployee(51, "M10", "M", 14, "D5"));

        //M6
        hremployees.add(EmployeeUtils.buildEmployee(52, "M11", "M", 15, "D6"));
        hremployees.add(EmployeeUtils.buildEmployee(53, "M12", "M", 15, "D6"));

        //M7
        hremployees.add(EmployeeUtils.buildEmployee(54, "M13", "M", 16, "D7"));
        hremployees.add(EmployeeUtils.buildEmployee(55, "M14", "M", 16, "D7"));

        //M8
        hremployees.add(EmployeeUtils.buildEmployee(56, "M15", "M", 17, "D8"));
        hremployees.add(EmployeeUtils.buildEmployee(57, "M16", "M", 17, "D8"));

        //M9
        hremployees.add(EmployeeUtils.buildEmployee(58, "M17", "M", 18, "D9"));
        hremployees.add(EmployeeUtils.buildEmployee(59, "M18", "M", 18, "D9"));

        //M10
        hremployees.add(EmployeeUtils.buildEmployee(60, "M19", "M", 19, "D10"));
        hremployees.add(EmployeeUtils.buildEmployee(61, "M20", "M", 19, "D10"));

        //M11
        hremployees.add(EmployeeUtils.buildEmployee(62, "M21", "M", 20, "D11"));
        hremployees.add(EmployeeUtils.buildEmployee(63, "M22", "M", 20, "D11"));

        //M12
        hremployees.add(EmployeeUtils.buildEmployee(64, "M23", "M", 21, "D12"));
        hremployees.add(EmployeeUtils.buildEmployee(65, "M24", "M", 21, "D12"));

        //M13
        hremployees.add(EmployeeUtils.buildEmployee(66, "M25", "M", 22, "D13"));
        hremployees.add(EmployeeUtils.buildEmployee(67, "M26", "M", 22, "D13"));

        //M14
        hremployees.add(EmployeeUtils.buildEmployee(68, "M27", "M", 23, "D14"));
        hremployees.add(EmployeeUtils.buildEmployee(69, "M28", "M", 23, "D14"));

        //M15
        hremployees.add(EmployeeUtils.buildEmployee(70, "M29", "M", 24, "D15"));
        hremployees.add(EmployeeUtils.buildEmployee(71, "M30", "M", 24, "D15"));

        //M16
        hremployees.add(EmployeeUtils.buildEmployee(72, "M31", "M", 25, "D16"));
        hremployees.add(EmployeeUtils.buildEmployee(73, "M32", "M", 25, "D16"));


        // M17
        hremployees.add(EmployeeUtils.buildEmployee(74, "M33", "M", 26, "D17"));
        hremployees.add(EmployeeUtils.buildEmployee(75, "M34", "M", 26, "D17"));

        // M18
        hremployees.add(EmployeeUtils.buildEmployee(76, "M35", "M", 27, "D18"));
        hremployees.add(EmployeeUtils.buildEmployee(77, "M36", "M", 27, "D18"));

        // M19
        hremployees.add(EmployeeUtils.buildEmployee(78, "M37", "M", 28, "D19"));
        hremployees.add(EmployeeUtils.buildEmployee(79, "M38", "M", 28, "D19"));

        // M20
        hremployees.add(EmployeeUtils.buildEmployee(80, "M39", "M", 29, "D20"));
        hremployees.add(EmployeeUtils.buildEmployee(81, "M8", "M", 29, "D20"));

        // M21
        hremployees.add(EmployeeUtils.buildEmployee(82, "M40", "M", 30, "D21"));
        hremployees.add(EmployeeUtils.buildEmployee(83, "M41", "M", 30, "D21"));

        // M22
        hremployees.add(EmployeeUtils.buildEmployee(84, "M42", "M", 31, "D22"));
        hremployees.add(EmployeeUtils.buildEmployee(85, "M43", "M", 31, "D22"));

        // M23
        hremployees.add(EmployeeUtils.buildEmployee(86, "M44", "M", 32, "D23"));
        hremployees.add(EmployeeUtils.buildEmployee(87, "M45", "M", 32, "D23"));

        // M24
        hremployees.add(EmployeeUtils.buildEmployee(88, "M46", "M", 33, "D24"));
        hremployees.add(EmployeeUtils.buildEmployee(89, "M47", "M", 33, "D24"));

        // M25
        hremployees.add(EmployeeUtils.buildEmployee(90, "M48", "M", 34, "D25"));
        hremployees.add(EmployeeUtils.buildEmployee(91, "M49", "M", 34, "D25"));

        // M26
        hremployees.add(EmployeeUtils.buildEmployee(92, "M50", "M", 35, "D26"));
        hremployees.add(EmployeeUtils.buildEmployee(93, "M51", "M", 35, "D26"));

        // M27
        hremployees.add(EmployeeUtils.buildEmployee(94, "M52", "M", 36, "D27"));
        hremployees.add(EmployeeUtils.buildEmployee(95, "M53", "M", 36, "D27"));

        // M28
        hremployees.add(EmployeeUtils.buildEmployee(96, "M54", "M", 37, "D28"));
        hremployees.add(EmployeeUtils.buildEmployee(97, "M55", "M", 37, "D28"));

        // M29
        hremployees.add(EmployeeUtils.buildEmployee(98, "M56", "M", 38, "D29"));
        hremployees.add(EmployeeUtils.buildEmployee(99, "M57", "M", 38, "D29"));

        // M30
        hremployees.add(EmployeeUtils.buildEmployee(100, "M58", "M", 39, "D30"));
        hremployees.add(EmployeeUtils.buildEmployee(101, "M59", "M", 39, "D30"));

        // M31
        hremployees.add(EmployeeUtils.buildEmployee(102, "M60", "M", 40, "D31"));
        hremployees.add(EmployeeUtils.buildEmployee(103, "M61", "M", 40, "D31"));

        // M32
        hremployees.add(EmployeeUtils.buildEmployee(104, "M62", "M", 41, "D32"));
        hremployees.add(EmployeeUtils.buildEmployee(105, "M63", "M", 41, "D32"));


        return hremployees;
    }

    public List<Employee> getDirectorsForSD(Integer sdId) {
        List<Employee> directorList = buildHREmployees().stream()
                .filter(employee -> (employee.getDesignation().equalsIgnoreCase("D")
                        && employee.getBossId() == sdId)).collect(Collectors.toList());

        return directorList;
    }

    public List<Employee> getManagersForSeniorDirector(Integer sdId) {

        List<Employee> managerList = new ArrayList<>();

        //Step 1
        List<Employee> directorList = buildHREmployees().stream()
                .filter(employee -> (employee.getDesignation().equalsIgnoreCase("D")
                        && employee.getBossId() == sdId)).collect(Collectors.toList());

        //Step 2
        for (Employee director : directorList) {
            for (Employee employee : buildHREmployees()) {
                if (employee.getDesignation().equals("M") && (employee.getBossId() == director.getId())) {
                    managerList.add(employee);
                }
            }
        }

        return managerList;
    }
}
