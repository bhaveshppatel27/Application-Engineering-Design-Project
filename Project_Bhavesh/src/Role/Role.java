/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.EcoSystem;
import Enterprise.Enterprise;
import Network.Network;
import Organization.Organization;
import UserAccount.UserAccount;
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
