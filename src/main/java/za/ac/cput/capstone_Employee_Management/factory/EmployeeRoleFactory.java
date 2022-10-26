package za.ac.cput.capstone_Employee_Management.factory;


import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeLeave;
import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeRole;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

public class EmployeeRoleFactory {
    public  static EmployeeRole build(Long employeeId, Long roleId){
        Helper.checkStringPara("roleId:", String.valueOf(roleId));
        Helper.checkStringPara("employeeId", String.valueOf(employeeId));
        return new EmployeeRole.Builder()
                .setEmployeeId(employeeId).setRoleId(roleId).build();

    }
}
