/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAccount;

import Employee.Employee;
import Role.Role;
import WorkQueue.WorkQueue;

/**
 *
 * @author Bhavesh Patel
 */
public class UserAccount {
    
    private String username;
  private String password;
  private Employee employee;
  private Role role;
  private WorkQueue workQueue;
  
  public UserAccount()
  {
    this.workQueue = new WorkQueue();
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setUsername(String username)
  {
    this.username = username;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public Role getRole()
  {
    return this.role;
  }
  
  public void setEmployee(Employee employee)
  {
    this.employee = employee;
  }
  
  public void setRole(Role role)
  {
    this.role = role;
  }
  
  public Employee getEmployee()
  {
    return this.employee;
  }
  
  public WorkQueue getWorkQueue()
  {
    return this.workQueue;
  }
  
  public String toString()
  {
    return this.username;
  }
    
}
