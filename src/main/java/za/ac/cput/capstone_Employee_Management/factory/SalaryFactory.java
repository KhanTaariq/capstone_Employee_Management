package za.ac.cput.capstone_Employee_Management.factory;

import za.ac.cput.capstone_Employee_Management.domain.Salary;
import za.ac.cput.capstone_Employee_Management.helper.Helper;

public class SalaryFactory
{
    public static Salary build(String salaryAmount, String salaryDescription)
    {
        Helper.checkStringPara("salaryDescription", salaryDescription);
        Helper.checkStringPara("salaryAmount", salaryAmount);
        return new Salary.Builder()
                                    .setSalaryAmount(salaryAmount)
                                    .setSalaryDescription(salaryDescription)
                                    .build();
    }


}





