/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Bhavesh Patel
 */
public class RepairStaff extends Employee{
    
    private int phoneNumber;
    private String availability;
    
    public RepairStaff(){
        super();
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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
