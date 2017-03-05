/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkQueue;

import Employee.Customer;
import Employee.Employee;
import UserAccount.UserAccount;

/**
 *
 * @author Bhavesh Patel
 */
public class RepairRequest extends WorkRequest{
  private String repairResult;
  private double timeForRepair;
  private double leakageVolume;
  private int repairCost;
  private Customer customer;

    public int getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(int repairCost) {
        this.repairCost = repairCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getLeakageVolume() {
        return leakageVolume;
    }

    public void setLeakageVolume(double leakageVolume) {
        this.leakageVolume = leakageVolume;
    }
  
    public double getTimeForRepair() {
        return timeForRepair;
    }

    public void setTimeForRepair(double timeForRepair) {
        this.timeForRepair = timeForRepair;
    }
  
  public String getRepairResult()
  {
    return this.repairResult;
  }
  
  public void setRepairResult(String repairResult)
  {
    this.repairResult = repairResult;
  }

    @Override
    public String toString() {
        return super.getStatus();
    }
  
 
}

