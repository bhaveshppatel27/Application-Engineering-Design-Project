/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;



/**
 *
 * @author Bhavesh Patel
 */
public class ConfigBusiness1 {

    public static EcoSystem config(){
        
        EcoSystem system = ConfigureASystem.configure();
        
       
        Employee employee = system.getEmployeeDirectory().createEmployee("System Admin" ,"ilovedc27@gmail.com",Integer.parseInt("6178708311"));
         UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
         
         return system;
    }
    
}
