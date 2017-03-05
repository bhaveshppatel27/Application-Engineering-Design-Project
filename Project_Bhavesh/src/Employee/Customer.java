/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class Customer extends Employee {
    private int volumeAvailable;
    private TargetSensor targetSensor;
    private SourceSensor sourceSensor;
    private ArrayList<WaterUsage> waterUsageHistory;
    public Customer(){
        super();
        targetSensor = new TargetSensor();
        waterUsageHistory = new ArrayList<WaterUsage>();
    }

    public ArrayList<WaterUsage> getWaterUsageHistory() {
        return waterUsageHistory;
    }

    public void setWaterUsageHistory(ArrayList<WaterUsage> waterUsageHistory) {
        this.waterUsageHistory = waterUsageHistory;
    }

    public SourceSensor getSourceSensor() {
        return sourceSensor;
    }

    public void setSourceSensor(SourceSensor sourceSensor) {
        this.sourceSensor = sourceSensor;
    }

    public TargetSensor getTargetSensor() {
        return targetSensor;
    }

    public void setTargetSensor(TargetSensor targetSensor) {
        this.targetSensor = targetSensor;
    }

    public int getVolumeAvailable() {
        return volumeAvailable;
    }

    public void setVolumeAvailable(int volumeAvailable) {
        this.volumeAvailable = volumeAvailable;
    }
     
    @Override
    public String toString() {
        return super.getName();
    }
    
}
