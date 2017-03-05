/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author Bhavesh Patel
 */
public class BillUpdateRequest extends WorkRequest{
    private String updateResult;
    private UserAccount billRequestreceiver;
    public String getUpdateResult() {
        return updateResult;
    }

    public void setUpdateResult(String updateResult) {
        this.updateResult = updateResult;
    }

    public UserAccount getBillRequestreceiver() {
        return billRequestreceiver;
    }

    public void setBillRequestreceiver(UserAccount billRequestreceiver) {
        this.billRequestreceiver = billRequestreceiver;
    }

    
    
    @Override
    public String toString() {
        return super.getStatus();
    }
}
