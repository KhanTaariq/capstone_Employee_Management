package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.employee.EmployeeContact;
/*
ContactType.java
AUTHOR Farai Malone Chawora
Student Number 220145547
Date 19 Sep 2022
 */
public class EmployeeContactFactory {
 public  static EmployeeContact build(Long employeeId, Long contactId){
    if(employeeId.equals("^[a-zA-Z]*$")&& contactId.equals("^[a-zA-Z]*$"))
        throw new IllegalArgumentException("Employee contact must be have valid ID");
     return new EmployeeContact.Builder()
             .setEmployeeId(employeeId).setContactId(contactId).build();

  }

    public static void main(String[] args) {
        EmployeeContact ascwe=EmployeeContactFactory.build( 9L,8L);
        System.out.println(ascwe.toString());
    }
}
