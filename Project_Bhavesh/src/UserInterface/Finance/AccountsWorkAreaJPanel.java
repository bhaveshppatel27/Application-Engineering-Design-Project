/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Finance;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.WaterEnterprise;
import Business.Network.Network;
import Business.Organization.AccountsOrganization;
import Business.Organization.CustomerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bhavesh Patel
 */
public class AccountsWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AccountsWorkAreaJPanel
     */

    private JPanel container;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private AccountsOrganization organization;
    private Network network;
    private EcoSystem system;
    private CustomerOrganization customerOrganization;
    public AccountsWorkAreaJPanel(JPanel container,UserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem system, Network network) {
        initComponents();
        
        this.container = container;
        this.userAccount =userAccount;
        this.enterprise = enterprise;
        this.organization = (AccountsOrganization) organization;
        this.network = network;
        this.system = system;
        
        for(Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise1 instanceof WaterEnterprise){
                for(Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList()){
                    if(organization1 instanceof CustomerOrganization){
                        customerOrganization = (CustomerOrganization) organization1;
                    }
                }
            }
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Accounting Work Area");

        jButton1.setText("Manage Customer Accounts");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Manage Leakages Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Manage Billing Requests");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/Complaints/water_1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(628, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(80, 80, 80)
                .addComponent(jButton2)
                .addGap(72, 72, 72)
                .addComponent(jButton3)
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

               
        if(customerOrganization == null){
            JOptionPane.showMessageDialog(null, "No Customers available");
            return;
        }
        
            
            CustomerAccountsJPanel panel = new CustomerAccountsJPanel(container,userAccount,network,system,customerOrganization);
            container.add("CustomerAccountsJPanel", panel);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            if(customerOrganization == null){
            JOptionPane.showMessageDialog(null, "No Customers available");
            return;
        }
            
            LeakageAccountsJPanel panel = new LeakageAccountsJPanel(container,userAccount,network,system,customerOrganization,organization);
            container.add("CustomerAccountsJPanel", panel);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
            ManageBillRequestJPanel panel = new ManageBillRequestJPanel(container,userAccount,system);
            container.add("ManageBillRequestJPanel", panel);
            CardLayout layout = (CardLayout)container.getLayout();
            layout.next(container);
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
