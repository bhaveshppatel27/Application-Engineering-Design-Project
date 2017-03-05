/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import UserAccount.UserAccount;

/**
 *
 * @author Bhavesh Patel
 */
public class Employee {
    
    private String name;
  private int id;
  private static int count = 1;
  private UserAccount userAccount;
  
  public Employee()
  {
    this.id = count;
    count += 1;
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
