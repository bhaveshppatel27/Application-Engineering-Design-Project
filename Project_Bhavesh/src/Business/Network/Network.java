/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Bhavesh Patel
 */
public class Network {
    
    private String name;
  private EnterpriseDirectory enterpriseDirectory;
  
  public Network()
  {
    this.enterpriseDirectory = new EnterpriseDirectory();
  }
  
  public EnterpriseDirectory getEnterpriseDirectory()
  {
    return this.enterpriseDirectory;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String toString()
  {
    return this.name;
  }
    
}
