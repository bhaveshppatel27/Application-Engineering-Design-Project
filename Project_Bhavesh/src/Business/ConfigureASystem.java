/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.SystemAdmin.SystemAdmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Bhavesh Patel
 */
public class ConfigureASystem
{
  public static EcoSystem configure()
  {
     EcoSystem system = EcoSystem.getInstance();
     Employee employee = new SystemAdmin();
     system.getEmployeeDirectory().getEmployeeList().add(employee);
     employee.setName("System Admin");
     employee.setContactNo(Long.parseLong("6175236584"));
     employee.setEmailId("admin@yahoo.com");
     
     UserAccount ua = system.getUserAccountDirectory().createUserAccount("s", "s", employee, new SystemAdminRole());
     employee.setUserAccount(ua);
     SystemAdmin systemAdmin = (SystemAdmin) employee;
     systemAdmin.getWaterPrice().setWaterPricePerGallon(12);
    return system;
  }
}
