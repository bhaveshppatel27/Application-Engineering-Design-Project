/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RepairStaff;

import Business.Employee.Employee;

/**
 *
 * @author Bhavesh Patel
 */
public class RepairStaff extends Employee{
    
    private int efficiency;
    private String availability;
    
    public RepairStaff(){
        super();
    }

    public int getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
     @Override
    public String toString() {
        return super.getName();
    }
    
}
