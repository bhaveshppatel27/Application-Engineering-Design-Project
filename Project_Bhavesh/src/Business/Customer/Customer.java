/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.WaterSupplyAdmin.SourceSensor;
import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Bhavesh Patel
 */
public class Customer extends Employee {
    private int volumeAvailable;
    private String notification;
    private String chatMessage;
    private String complaintChatMessage;
    
    private TargetSensor targetSensor;
    private SourceSensor sourceSensor;
    
    private double usageTotal;
    private Date billingDate;
    private double totalBill;
    
    private ArrayList<WaterUsage> waterUsageHistory;
    
    public Customer(){
        super();
        targetSensor = new TargetSensor();
        waterUsageHistory = new ArrayList<WaterUsage>();
    }

    public String getComplaintChatMessage() {
        return complaintChatMessage;
    }

    public void setComplaintChatMessage(String complaintChatMessage) {
        this.complaintChatMessage = complaintChatMessage;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    
    public double getUsageTotal() {
        return usageTotal;
    }

    public void setUsageTotal(double usageTotal) {
        this.usageTotal = usageTotal;
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
     
    public double getTotalUsageVolume(){
        double total = 0;
        for(WaterUsage waterUsage : this.waterUsageHistory){
            total +=waterUsage.getUsageVolume();
        }
        return total;
    }
    @Override
    public String toString() {
        return super.getName();
    }
    
}
