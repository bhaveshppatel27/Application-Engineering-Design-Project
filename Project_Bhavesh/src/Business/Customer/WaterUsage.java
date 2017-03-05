/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.Date;

/**
 *
 * @author Bhavesh Patel
 */
public class WaterUsage {

    private float flowrate;
    private double timeOfUsage;
    private double usageVolume;
    private Date date;
    
    public WaterUsage(){
        
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public double getUsageVolume() {
        return usageVolume;
    }

    public void setUsageVolume(double usageVolume) {
        this.usageVolume = usageVolume;
    }
    
    public float getFlowrate() {
        return flowrate;
    }

    public void setFlowrate(float flowrate) {
        this.flowrate = flowrate;
    }

    public double getTimeOfUsage() {
        return timeOfUsage;
    }

    public void setTimeOfUsage(double timeOfUsage) {
        this.timeOfUsage = timeOfUsage;
    }
    
    
    @Override
    public String toString() {
        return "WaterUsage";
    }
    
}
