/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WaterSupplyAdmin;

import java.util.Date;

/**
 *
 * @author Bhavesh Patel
 */
public class SensorValue {
    private float pressure;
    private float flowrate;
    private Date date;

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getFlowrate() {
        return flowrate;
    }

    public void setFlowrate(float flowrate) {
        this.flowrate = flowrate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SensorValue";
    }
    
}
