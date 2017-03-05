/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Bhavesh Patel
 */
public class ComplaintRequest extends WorkRequest {
    
    private String complaintResult;

    public String getComplaintResult() {
        return complaintResult;
    }

    public void setComplaintResult(String complaintResult) {
        this.complaintResult = complaintResult;
    }

    @Override
    public String toString() {
        return super.getStatus();
    }
 
}
