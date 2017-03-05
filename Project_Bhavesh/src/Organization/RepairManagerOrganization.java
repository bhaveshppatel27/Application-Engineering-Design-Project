/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import Role.RepairManagerRole;
import Role.RepairStaffRole;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class RepairManagerOrganization
  extends Organization
{
  public RepairManagerOrganization()
  {
    super(Organization.Type.RepairManager.getValue());
  }
  
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RepairManagerRole());
        return roles;
    }
}
