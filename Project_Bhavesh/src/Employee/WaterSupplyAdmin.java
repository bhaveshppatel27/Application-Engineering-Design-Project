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
public class WaterSupplyAdmin extends Employee{
    
     
    private ArrayList<SourceSensor> sensorList;
    
    public WaterSupplyAdmin(){
        super();
        sensorList = new ArrayList<SourceSensor>();
    }

    public ArrayList<SourceSensor> getSensorList() {
        return sensorList;
    }

    public void setSensorList(ArrayList<SourceSensor> sensorList) {
        this.sensorList = sensorList;
    }

    
    @Override
    public String toString() {
        return super.getName();
    }
}
