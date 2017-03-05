/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class OrganizationDirectory {
 
    private ArrayList<Organization> organizationList;
  
  public OrganizationDirectory()
  {
    this.organizationList = new ArrayList();
  }
  
  public ArrayList<Organization> getOrganizationList()
  {
    return this.organizationList;
  }
  
  public Organization createOrganization(Organization.Type type)
  {
    Organization organization = null;
    if (type.getValue().equals(Organization.Type.RepairManager.getValue()))
    {
      organization = new RepairManagerOrganization();
      this.organizationList.add(organization);
    }
    else if (type.getValue().equals(Organization.Type.RepairStaff.getValue()))
    {
      organization = new RepairStaffOrganization();
      this.organizationList.add(organization);
    }
    else if (type.getValue().equals(Organization.Type.Accounts.getValue()))
    {
      organization = new AccountsOrganization();
      this.organizationList.add(organization);
    }
    else if (type.getValue().equals(Organization.Type.Complaints.getValue()))
    {
      organization = new ComplaintsOrganization();
      this.organizationList.add(organization);
    }
    else if (type.getValue().equals(Organization.Type.Customer.getValue()))
    {
      organization = new CustomerOrganization();
      this.organizationList.add(organization);
    }
    else if (type.getValue().equals(Organization.Type.CensorMonitoring.getValue()))
    {
      organization = new CensorMonitoringOrganization();
      this.organizationList.add(organization);
    }
    else if (type.getValue().equals(Organization.Type.WaterSupply.getValue()))
    {
      organization = new WaterSupplyOrganization();
      this.organizationList.add(organization);
    }
    return organization;
  }
    
}
