/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkAreas;

import Business.EcoSystem;
import Employee.Customer;
import Employee.Employee;
import Employee.SourceSensor;
import Employee.WaterSupplyAdmin;
import Enterprise.Enterprise;
import Organization.CustomerOrganization;
import Organization.Organization;
import UserAccount.UserAccount;
import UserInterface.EnterpriseAdmin.ManageUserAccountJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bhavesh Patel
 */
public class WaterSupplyAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WaterSupplyAdminWorkAreaJPanel
     */
    private Enterprise enterprise;
    private JPanel container;
    private Organization organization;
    private UserAccount userAccount;
    public WaterSupplyAdminWorkAreaJPanel(JPanel container,UserAccount userAccount,Organization organization,Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.container = container;
        this.organization = organization;
        nameTxt.setText(userAccount.getEmployee().getName());
        populateTable();
    }

    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        //WaterSupplyAdmin waterSupplyAdmin = (WaterSupplyAdmin) userAccount.getEmployee();
        
        model.setRowCount(0);
        
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof CustomerOrganization){
                for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
                    Customer customer = (Customer)employee;
         
            Object[] row = new Object[4];
            row[0] = employee.getId();
            row[1] = customer;
            row[2] = customer.getVolumeAvailable() == 0? "NO" : "YES";
            row[3] = customer.getVolumeAvailable();
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Water Supply Admin : -");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CustomerID", "Customer Name", "Water Supply On", "Volume Available"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Customers");

        nameTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton1.setText("Start Supply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(114, 114, 114)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int selectedRow = table.getSelectedRow();
       if(selectedRow <0){
           JOptionPane.showMessageDialog(null, "Select a customer first");
           return;
       }
        Customer customer = (Customer)table.getValueAt(selectedRow, 1);
        if(customer.getVolumeAvailable() == 0){
            SupplyWaterJPanel panel = new SupplyWaterJPanel(container, enterprise,customer,userAccount);
            container.add("SupplyWaterJPanel", panel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }else{
            JOptionPane.showMessageDialog(null, "Water Supplied");
            return;
        }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameTxt;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
