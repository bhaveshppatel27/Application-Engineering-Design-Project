/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Repair;

import Employee.Employee;
import Employee.RepairStaff;
import Enterprise.Enterprise;
import Organization.CustomerOrganization;
import Organization.Organization;
import Organization.RepairStaffOrganization;
import UserAccount.UserAccount;
import WorkQueue.RepairRequest;
import WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavesh Patel
 */
public class ResourceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResourceJPanel
     */
    private Enterprise enterprise;
    private JPanel container;
    private UserAccount userAccount;
    private Organization organization;
    private RepairRequest request;
    public ResourceJPanel(JPanel container,UserAccount userAccount,Enterprise enterprise,WorkRequest workRequest) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = (RepairRequest) workRequest;
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof RepairStaffOrganization){
                this.organization = organization;
                break;
            }
        }
        
        populateAllStaff();
    }
    
    private void populateAllStaff(){
        
        DefaultTableModel model = (DefaultTableModel) tableall.getModel();
        model.setRowCount(0);
        for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            RepairStaff repairStaff = (RepairStaff) employee;
            Object[] row = new Object[4];
            row[0] = repairStaff.getId();
            row[1] = repairStaff;
            row[2] = repairStaff.getPhoneNumber();
            row[3] = repairStaff.getAvailability();
            
            model.addRow(row);
        
          
        }
        
    }
    
    private void populateAvailableStaff(){
        
        DefaultTableModel model = (DefaultTableModel) availStaffTable.getModel();
        model.setRowCount(0);
        for(Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            RepairStaff repairStaff = (RepairStaff) employee;
            if(repairStaff.getAvailability().equalsIgnoreCase("YES")){
            Object[] row = new Object[3];
            row[0] = repairStaff.getId();
            row[1] = repairStaff;
            row[2] = repairStaff.getPhoneNumber();
            
            
            model.addRow(row);
        
            }
        }
        if(availStaffTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "No Resource available");
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableall = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        availStaffTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        tableall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Name", "Contact No.", "Available Today"
            }
        ));
        jScrollPane1.setViewportView(tableall);

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("List of Repair Staffs");

        jButton1.setText("Show Available Resources");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        availStaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Name", "Contact No."
            }
        ));
        jScrollPane2.setViewportView(availStaffTable);
        if (availStaffTable.getColumnModel().getColumnCount() > 0) {
            availStaffTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton3.setText("Assign");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
        int index = container.getComponentCount() - 1;
        RepairManagerWorkAreaJPanel panel = (RepairManagerWorkAreaJPanel) container.getComponent(index);
        panel.populateRequestTable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        populateAvailableStaff();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int selectedRow = availStaffTable.getSelectedRow();
            if(selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Select a staff first");
                return;
            }
            RepairStaff repairStaff = (RepairStaff) availStaffTable.getValueAt(selectedRow, 1);
            UserAccount ua = repairStaff.getUserAccount();
            request.setReceiver(repairStaff);
            request.setStatus("Assigned");
            ua.getWorkQueue().getWorkRequestList().add(request);
            
            JOptionPane.showMessageDialog(null, "Request Assigned");
            
            container.remove(this);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.previous(container);
        
            int index = container.getComponentCount() - 1;
            RepairManagerWorkAreaJPanel panel = (RepairManagerWorkAreaJPanel) container.getComponent(index);
            panel.populateRequestTable();
            
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availStaffTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableall;
    // End of variables declaration//GEN-END:variables
}
