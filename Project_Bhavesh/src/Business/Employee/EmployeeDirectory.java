/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
  
  public EmployeeDirectory()
  {
    this.employeeList = new ArrayList();
  }
  
  public ArrayList<Employee> getEmployeeList()
  {
    return this.employeeList;
  }
  
  public Employee createEmployee(String name, String mail, long number)
  {
    Employee employee = new Employee();
    employee.setName(name);
    employee.setEmailId(mail);
    employee.setContactNo(number);
    this.employeeList.add(employee);
    return employee;
  }
    
}
