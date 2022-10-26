package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.helper.Helper;
/*
EMPLOYEE_LEAVE_FACTORY.java
AUTHOR KULULO MANGCUNYANA
Student Number 219387117
Date 19 Sep 2022
 */


public class EmployeeLeaveFactory {

    public  static EmployeeLeave build(Long employeeId, Long leaveId){
        Helper.checkStringPara("leaveId:", String.valueOf(leaveId));
        Helper.checkStringPara("employeeId", String.valueOf(employeeId));
        return new EmployeeLeave.Builder()
                .setEmployeeId(employeeId).setLeaveId(leaveId).build();

    }


}