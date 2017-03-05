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
public class WaterUsage {

    private float flowrate;
    private double timeOfUsage;
    private double usageVolume;
    public WaterUsage(){
        
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
