/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.WaterSupplyAdmin.SensorValue;
import java.util.ArrayList;

/**
 *
 * @author Bhavesh Patel
 */
public class TargetSensor {
    private String sensorName;
    private String location;
    private ArrayList<SensorValue> sensorValueList;
    
    public TargetSensor(){
        sensorValueList = new ArrayList<SensorValue>();
    }

    public ArrayList<SensorValue> getSensorValueList() {
        return sensorValueList;
    }

    public void setSensorValueList(ArrayList<SensorValue> sensorValueList) {
        this.sensorValueList = sensorValueList;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    
    @Override
    public String toString() {
        return this.sensorName;
    }
}
