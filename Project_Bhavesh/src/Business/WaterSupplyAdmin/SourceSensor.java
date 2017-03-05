/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WaterSupplyAdmin;

import Business.Customer.Customer;

/**
 *
 * @author Bhavesh Patel
 */
public class SourceSensor {
    private String sensorName;
    private SensorValue sensorValue;
    private String location;
    private Customer customer;
    private int supplyVolume;
    
    public SourceSensor(){
        sensorValue = new SensorValue();
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public int getSupplyVolume() {
        return supplyVolume;
    }

    public void setSupplyVolume(int supplyVolume) {
        this.supplyVolume = supplyVolume;
    }

    public SensorValue getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(SensorValue sensorValue) {
        this.sensorValue = sensorValue;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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
