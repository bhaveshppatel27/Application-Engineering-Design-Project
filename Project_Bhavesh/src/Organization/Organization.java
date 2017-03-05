/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import Employee.EmployeeDirectory;
import Role.Role;
import UserAccount.UserAccountDirectory;
import WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public abstract class Organization
{
  private String name;
  private WorkQueue workQueue;
  private EmployeeDirectory employeeDirectory;
  private UserAccountDirectory userAccountDirectory;
  private int organizationID;
  private static int counter;
  protected ArrayList<Role> roles = null;
  
  public static enum Type
  {
    WaterSupply("WaterSupply Organization"),  RepairManager("Repair Manager Organization"), RepairStaff("Repair Staff Organization"),  Accounts("Accounts Organization"),  Complaints("Complaints Organization"), Customer("Customer Organization"),CensorMonitoring("CensorMonitoring Organization"),;
    
    private String value;
    
    private Type(String value)
    {
      this.value = value;
    }
    
    public String getValue()
    {
      return this.value;
    }
  }
  
  public Organization(String name)
  {
    this.name = name;
    this.workQueue = new WorkQueue();
    this.employeeDirectory = new EmployeeDirectory();
    this.userAccountDirectory = new UserAccountDirectory();
    this.organizationID = counter;
    counter += 1;
    this.roles = new ArrayList();
  }
  
  public abstract ArrayList<Role> getSupportedRole();
  
  public UserAccountDirectory getUserAccountDirectory()
  {
    return this.userAccountDirectory;
  }
  
  public int getOrganizationID()
  {
    return this.organizationID;
  }
  
  public EmployeeDirectory getEmployeeDirectory()
  {
    return this.employeeDirectory;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public WorkQueue getWorkQueue()
  {
    return this.workQueue;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setWorkQueue(WorkQueue workQueue)
  {
    this.workQueue = workQueue;
  }
  
  public String toString()
  {
    return this.name;
  }
}

