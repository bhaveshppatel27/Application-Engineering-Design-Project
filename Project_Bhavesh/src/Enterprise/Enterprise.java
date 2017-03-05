/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;

import Organization.Organization;
import Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public abstract class Enterprise extends Organization {
  private EnterpriseType enterpriseType;
  private OrganizationDirectory organizationDirectory;
  
  public Enterprise(String name, EnterpriseType type)
  {
    super(name);
    this.enterpriseType = type;
    this.organizationDirectory = new OrganizationDirectory();
    
  }
  
  public static enum EnterpriseType
  {
    Repair("Repair"),Water("Water"),Finance("Finance");
    
    private String value;
    
    private EnterpriseType(String value)
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
  
  public EnterpriseType getEnterpriseType()
  {
    return this.enterpriseType;
  }
  
  public OrganizationDirectory getOrganizationDirectory()
  {
    return this.organizationDirectory;
  }
}
