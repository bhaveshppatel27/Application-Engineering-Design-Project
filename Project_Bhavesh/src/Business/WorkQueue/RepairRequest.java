/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;

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
  private int repairRequestNo;
  private double leakageCost;
  private static int count = 1000;
  
    public RepairRequest(){
       count++;
       this.repairRequestNo = count;       
    }

    public int getRepairRequestNo() {
        return repairRequestNo;
    }

    public void setRepairRequestNo(int repairRequestNo) {
        this.repairRequestNo = repairRequestNo;
    }
    
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

    public double getLeakageCost() {
        return leakageCost;
    }

    public void setLeakageCost(double leakageCost) {
        this.leakageCost = leakageCost;
    }

    @Override
    public String toString() {
        return super.getStatus();
    }
  
 
}

