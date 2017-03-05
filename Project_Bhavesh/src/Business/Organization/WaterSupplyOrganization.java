/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.WaterSupplyAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class WaterSupplyOrganization
  extends Organization
{
  public WaterSupplyOrganization()
  {
    super(Organization.Type.WaterSupply.getValue());
  }
  
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WaterSupplyAdminRole());;
        return roles;
    }
}

