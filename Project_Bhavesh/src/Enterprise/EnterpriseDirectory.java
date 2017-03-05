/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
  
  public EnterpriseDirectory()
  {
    this.enterpriseList = new ArrayList();
  }
  
  public ArrayList<Enterprise> getEnterpriseList()
  {
    return this.enterpriseList;
  }
  
  public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type)
  {
    Enterprise enterprise = null;
    if (type == Enterprise.EnterpriseType.Repair)
    {
      enterprise = new RepairEnterprise(name);
      this.enterpriseList.add(enterprise);
    }
    else if (type == Enterprise.EnterpriseType.Water)
    {
      enterprise = new WaterEnterprise(name);
      this.enterpriseList.add(enterprise);
    }
    else if (type == Enterprise.EnterpriseType.Finance)
    {
      enterprise = new FinanceEnterprise(name);
      this.enterpriseList.add(enterprise);
    }
    return enterprise;
  }
    
}
