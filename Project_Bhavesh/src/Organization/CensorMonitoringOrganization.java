/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import Role.CensorMonitoringRole;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class CensorMonitoringOrganization
  extends Organization
{
  public CensorMonitoringOrganization()
  {
    super(Organization.Type.CensorMonitoring.getValue());
  }
  
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CensorMonitoringRole());
        return roles;
    }
}

