/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class RepairEnterprise
  extends Enterprise
{
  public RepairEnterprise(String name)
  {
    super(name, Enterprise.EnterpriseType.Repair);
  }
  
  public ArrayList<Role> getSupportedRole()
  {
    return this.roles;
  }
}
