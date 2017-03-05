/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SensorMonitoringRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class SensorMonitoringOrganization
  extends Organization
{
  public SensorMonitoringOrganization()
  {
    super(Organization.Type.SensorMonitoring.getValue());
  }
  
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SensorMonitoringRole());
        return roles;
    }
}

