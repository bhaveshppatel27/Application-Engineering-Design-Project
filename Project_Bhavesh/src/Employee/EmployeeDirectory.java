/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

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
  
  public Employee createEmployee(String name)
  {
    Employee employee = new Employee();
    employee.setName(name);
    this.employeeList.add(employee);
    return employee;
  }
    
}
