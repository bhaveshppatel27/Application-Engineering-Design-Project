/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.SensorMonitoring.SensorMonitoringWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bhavesh Patel
 */
public class SensorMonitoringRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es,Network n) {
        return new SensorMonitoringWorkAreaJPanel(pnl,ua,e,n);
    }
    
}