/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Bhavesh Patel
 */
public class Employee {
    
  private String name;
  private String emailId;
  private long contactNo;
  private int id;
  private static int count = 1;
  private UserAccount userAccount;
  
  public Employee()
  {
    this.id = count;
    count += 1;
  }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String toString()
  {
    return this.name;
  }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
  
}
