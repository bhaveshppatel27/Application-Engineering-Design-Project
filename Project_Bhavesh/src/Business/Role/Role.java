/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Bhavesh Patel
 */
public abstract class Role
{
  public abstract JPanel createWorkArea(JPanel paramJPanel, UserAccount paramUserAccount, Organization paramOrganization, Enterprise paramEnterprise, EcoSystem paramEcoSystem,Network n);
  
  public static enum RoleType
  {
    Admin("Admin"),  Nurse("Nurse"),  Receptionist("Receptionist"),  Donor("Donor");
    
    private String value;
    
    private RoleType(String value)
    {
      this.value = value;
    }
    
    public String getValue()
    {
      return this.value;
    }
    
    public String toString()
    {
      return this.value;
    }
  }
  
  public String toString()
  {
    return getClass().getName();
  }
}
