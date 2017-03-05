/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import Role.CustomerRole;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class CustomerOrganization
  extends Organization
{
  public CustomerOrganization()
  {
    super(Organization.Type.Customer.getValue());
  }
  
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CustomerRole());
        
        return roles;
    }
}
