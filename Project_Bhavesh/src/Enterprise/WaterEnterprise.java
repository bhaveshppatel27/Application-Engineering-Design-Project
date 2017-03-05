/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class WaterEnterprise
  extends Enterprise
{
  public WaterEnterprise(String name)
  {
    super(name, Enterprise.EnterpriseType.Water);
  }
  
  public ArrayList<Role> getSupportedRole()
  {
    return this.roles;
  }
}

