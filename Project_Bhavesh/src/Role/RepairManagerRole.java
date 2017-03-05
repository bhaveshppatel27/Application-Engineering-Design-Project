/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Role;

import Business.EcoSystem;
import Enterprise.Enterprise;
import Network.Network;
import Organization.Organization;
import UserAccount.UserAccount;
import UserInterface.SystemAdmin.SystemAdminWorkAreaJPanel;
import UserInterface.Repair.RepairManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Bhavesh Patel
 */
public class RepairManagerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es,Network n) {
        
        return new RepairManagerWorkAreaJPanel(pnl,ua,e,o);
    }
    
}
