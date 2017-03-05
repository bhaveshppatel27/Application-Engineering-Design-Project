/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAccount;

import Employee.Employee;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
  
  public UserAccountDirectory()
  {
    this.userAccountList = new ArrayList();
  }
  
  public ArrayList<UserAccount> getUserAccountList()
  {
    return this.userAccountList;
  }
  
  public UserAccount authenticateUser(String username, String password)
  {
    for (UserAccount ua : this.userAccountList) {
      if ((ua.getUsername().equals(username)) && (ua.getPassword().equals(password))) {
        return ua;
      }
    }
    return null;
  }
  
  public UserAccount createUserAccount(String username, String password, Employee employee, Role role)
  {
    UserAccount userAccount = new UserAccount();
    userAccount.setUsername(username);
    userAccount.setPassword(password);
    userAccount.setEmployee(employee);
    userAccount.setRole(role);
    
    this.userAccountList.add(userAccount);
    userAccount.getEmployee().setUserAccount(userAccount);
    return userAccount;
  }
  
  public boolean checkIfUsernameIsUnique(String username)
  {
    for (UserAccount ua : this.userAccountList) {
      if (ua.getUsername().equals(username)) {
        return false;
      }
    }
    return true;
  }
    
}
