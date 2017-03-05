/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemAdmin;

import Business.Employee.Employee;

/**
 *
 * @author Bhavesh Patel
 */
public class SystemAdmin extends Employee{
   
    private WaterPrice waterPrice;
    
    public SystemAdmin(){
        waterPrice = new WaterPrice();
    }

    public WaterPrice getWaterPrice() {
        return waterPrice;
    }

    public void setWaterPrice(WaterPrice waterPrice) {
        this.waterPrice = waterPrice;
    }
    
    
}
